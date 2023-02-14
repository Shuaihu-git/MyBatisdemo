import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import shuaihu.vip.cache.mapper.CacheMapper;
import shuaihu.vip.pojo.Dept;
import shuaihu.vip.pojo.Emp;
import shuaihu.vip.utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;

public class TestCacheEmp {
    /**
     * 测试MyBatis的一级缓存，测试结果：MyBatis的一级缓存是SQLSession级别的
     */
    @Test
    public void testEmpByIdForLevel1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(3);
        System.out.println(empById);
        Emp empById2 = mapper.getEmpById(3);
        System.out.println(empById2);


        SqlSession sqlSession1= SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById1 = mapper1.getEmpById(3);
        System.out.println(empById1);

    }
    /**
     * 测试MyBatis的一级缓存失效情况
     * 同一个SqLSession查询期间执行了任何增删查改的一种
     */
    @Test
    public void testEmpByIdForLevel1Error1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(3);
        System.out.println(empById);
        Emp emp = new Emp(null, "test2", 15, "男");
        emp.setDept(new Dept(1,"技术部门"));
        mapper.insertEmp(emp);

        Emp empById2 = mapper.getEmpById(3);
        System.out.println(empById2);


    }
    /**
     * 测试MyBatis的一级缓存失效情况
     * 手动清空缓存
     */
    @Test
    public void testEmpByIdForLevel1Error2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(3);
        System.out.println(empById);
          /*Emp emp = new Emp(null, "test2", 15, "男");
            emp.setDept(new Dept(1,"技术部门"));
            mapper.insertEmp(emp);*/
        sqlSession.clearCache();
        Emp empById2 = mapper.getEmpById(3);
        System.out.println(empById2);


    }
    /**
     * 测试二级缓存
     */
    @Test
    public void testCacheTwo(){
        InputStream resourceAsStream=null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession1 = factory.openSession(true);
        CacheMapper mapper = sqlSession1.getMapper(CacheMapper.class);

        System.out.println(mapper.getEmpById(6));
        sqlSession1.close();


        SqlSession sqlSession2 = factory.openSession(true);
        CacheMapper mapper1 = sqlSession2.getMapper(CacheMapper.class);
        Emp empById = mapper1.getEmpById(6);

        System.out.println(empById);
        sqlSession2.close();


    }
}
