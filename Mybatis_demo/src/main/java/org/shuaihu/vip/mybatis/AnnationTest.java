package org.shuaihu.vip.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.shuaihu.vip.mybatis.mapper.UserMapper;
import org.shuaihu.vip.mybatis.pojo.User;

import java.io.InputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface AnnationTest{
    String value();
    String out();
    int num();
    String findallUers() ;

}
