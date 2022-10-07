import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import vip.shuaihu.www.mapper.EmpMapper;
import vip.shuaihu.www.pojo.Emp;
import vip.shuaihu.www.utils.SqlSessionUtils;

import java.util.List;

public class TestEmpMapper {
    @Test
    public void testEmpMapper(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp=new Emp(null,"",null,"男");
        List<Emp> listByDynamic = mapper.getListByDynamic(emp);
        listByDynamic.forEach(System.out::println);
    }@Test
    public void testEmpMapperByChoose(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp=new Emp(null,"",null,"男");
        List<Emp> listByDynamic = mapper.getListByChoose(emp);
        listByDynamic.forEach(System.out::println);
    }
}
