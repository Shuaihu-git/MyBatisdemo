import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import vip.shuaihu.www.mapper.EmpMapper;
import vip.shuaihu.www.pojo.Emp;
import vip.shuaihu.www.utils.SqlSessionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestEmpMapper {
    @Test
    public void testEmpMapper(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp=new Emp(null,"",null,"男");
        List<Emp> listByDynamic = mapper.getListByDynamic(emp);
        listByDynamic.forEach(System.out::println);
    }
    @Test
    public void testEmpMapperByChoose(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp=new Emp(null,"",null,"男");
        List<Emp> listByDynamic = mapper.getListByChoose(emp);
        listByDynamic.forEach(System.out::println);
    }
    @Test
    public void testInsertEmpBybatch(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> emps=new ArrayList<>();
        Emp emp = new Emp(null,"张三", 22,  "男" );
        emps.add(emp);
        for (int i = 0; i < 20; i++) {
            String s = new String(new StringBuffer("++u513").append(i)).replace("++","");
            int anInt = new Random().nextInt(25);
            Emp emp1 = new Emp(null,s+i, anInt>0?anInt:22, i == i * 2 ? "男" : "女");
            emps.add(emp1);
        }
        mapper.InsertUsersByBatch(emps);
        emps.forEach(System.out::println);
    }
    @Test
    public void testDeleteEmpBybatch(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Integer[] integers=new Integer[]{18,19,20,21,22,23,24,25,26,27,28,29};
        mapper.deleteUsersByBatch(integers);

    }
    @Test
    public void testDeleteEmpByLike(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        int i = mapper.deleteUsersByLike("1");
        System.out.println(i);

    }
    @Test
    public void test(){
        String s="\u5532";
        System.out.println(s);
    }
}
