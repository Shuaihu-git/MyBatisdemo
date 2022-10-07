import com.shuaihu.vip.mapper.InsertUsers;
import com.shuaihu.vip.mapper.SelectUsers;
import com.shuaihu.vip.pojo.User;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestInsertUsers {
    @Test
    public void tsetInsertUser(){
        SqlSession session = SqlSessionUtils.getSession();
        InsertUsers mapper = session.getMapper(InsertUsers.class);
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);

//        mapper.insertUser(new User("9618","123456..",new Date(),"男","13637271700","ShuaiHu19991016"));
//        System.out.println("插入成功！");

    }
    @Test
    public void testInsertUserByKey(){
        SqlSession session = SqlSessionUtils.getSession();
        InsertUsers mapper = session.getMapper(InsertUsers.class);
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        User user=new User("2638178zzz","123456..",new Date(),"男","13637271700","ShuaiHu19991016",null);
        mapper.insertUserByKey(user);
        System.out.println("插入成功！");
        System.out.println(user);
    }
}
