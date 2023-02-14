import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import shuaihu.vip.mbg.mapper.DeptMapper;
import shuaihu.vip.mbg.pojo.Dept;
import shuaihu.vip.mbg.pojo.DeptExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDept {
    @Test
    public void testDept(){
        InputStream resourceAsStream =null;
        try {
           resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.selectByExample(new DeptExample());
        System.out.println(depts);


    }
}
