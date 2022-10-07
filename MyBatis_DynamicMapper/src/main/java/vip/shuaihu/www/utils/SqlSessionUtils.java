package vip.shuaihu.www.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionUtils {
    public static SqlSession getSession(){
        SqlSession sqlSession=null;
        try{
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
              sqlSession=build.openSession(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSession;

    }
}
