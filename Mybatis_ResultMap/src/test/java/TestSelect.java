import org.apache.ibatis.session.SqlSession;
import com.shuaihu.vip.mapper.SelectUsers;
import com.shuaihu.vip.pojo.User;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSelect {
    @Test
    public void tsetSelect(){
        SqlSession session = SqlSessionUtils.getSession();
        SelectUsers mapper = session.getMapper(SelectUsers.class);

        List<User> allUser =mapper.getAllUsers();

        allUser.forEach(all-> System.out.println(all));
        Map<String,String> userMap=new HashMap<>();
        for (User temp:
             allUser) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            userMap.put(temp.getUser_name(), simpleDateFormat.format(temp.getBirthday()));
        }
        System.out.println(userMap.get("13213"));

    }

    @Test
    public void testSelectByUsername(){

        SqlSession session = SqlSessionUtils.getSession();
        SelectUsers mapper = session.getMapper(SelectUsers.class);
        User user = mapper.selectUserByUserName("9618");
        System.out.println(user);

    }
    @Test
    public void testSelectLikeByUserName(){
        SqlSession session = SqlSessionUtils.getSession();
        SelectUsers mapper = session.getMapper(SelectUsers.class);
        List<User> users = mapper.selectLikeByUserName("1");
        users.forEach(user -> System.out.println(user));
    }

}
