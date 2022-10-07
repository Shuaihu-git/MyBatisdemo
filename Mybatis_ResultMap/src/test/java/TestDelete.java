import com.shuaihu.vip.mapper.DeleteUsers;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestDelete {
    @Test
    public void testDeleteByUserName(){
        SqlSession sqlSession = SqlSessionUtils.getSession();
        DeleteUsers mapper = sqlSession.getMapper(DeleteUsers.class);
        mapper.deleteUserByUserName("9618");
    }
    @Test
    public void testDeleteUserByBatch(){
        SqlSession getSession = SqlSessionUtils.getSession();
        DeleteUsers mapper = getSession.getMapper(DeleteUsers.class);
        int deleteUserByBatch = mapper.deleteUserByBatch("11111,tttt,tttt1");
        System.out.println(deleteUserByBatch);
    }
}
