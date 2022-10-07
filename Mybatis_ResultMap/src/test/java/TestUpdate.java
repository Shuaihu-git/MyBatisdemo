import com.shuaihu.vip.mapper.UpdateUsers;
import com.shuaihu.vip.pojo.User;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUpdate {
    @Test
    public void tsetUpdateUser(){
        SqlSession session = SqlSessionUtils.getSession();
        UpdateUsers mapper = session.getMapper(UpdateUsers.class);
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(new Date());
        try {
            System.out.println(simpleDateFormat.parse(format));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
      mapper.updateUser(new User("2638178z","123456..",new Date(),"男","13637271700","ShuaiHu19991016"));
    }
    @Test
    public void testUpdateUserByUserName(){
        SqlSession session = SqlSessionUtils.getSession();
        UpdateUsers mapper = session.getMapper(UpdateUsers.class);
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(new Date());
        try {
            System.out.println(simpleDateFormat.parse(format));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        mapper.updateUserByUserName("13213");
    }

}
