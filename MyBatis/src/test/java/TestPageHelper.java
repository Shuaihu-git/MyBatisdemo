import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import shuaihu.vip.mbg.mapper.EmpMapper;
import shuaihu.vip.mbg.pojo.Emp;

import java.io.IOException;
import java.io.InputStream;

public class TestPageHelper {
    /**
     * 测试分页
     * limit，index，pageSize
     * index：当前页的起始索引
     * pageSize：每页显示的条数
     * pageNum：当前页的页码
     * index=（pageNum-1）*pageSize
     */
    @Test
    public void testPageHelper(){
        SqlSession sqlSession=null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
