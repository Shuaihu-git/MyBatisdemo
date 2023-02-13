import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import shuaihu.vip.cache.mapper.CacheMapper;
import shuaihu.vip.pojo.Emp;
import shuaihu.vip.utils.SqlSessionUtils;

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
}
