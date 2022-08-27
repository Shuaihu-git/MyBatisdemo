package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.UserMapper;
import org.shuaihu.vip.mybatis.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testMybatis() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SQLSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //获取SQLSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        //获取SQLSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        //测试功能
        int result = userMapper.insertUser();
        //提交事务
        sqlSession.commit();
        System.out.println("result="+result);

    }
    @Test
    public void updateUser() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);

            SqlSession sqlSession = build.openSession(true);

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            mapper.updateUser();

            System.out.println("修改数据成功");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("修改数据失败");
        }

    }
    @Test
    public void deleteUser(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.deleteUser();
            System.out.println("删除数据成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("删除失败");
        }
    }
    @Test
    public void getUserById(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById();
            mapper.insertUser();
            List<User> list=mapper.findUserAll();
            list.forEach(user -> System.out.println(user));
            System.out.println(userById);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void annoation(){

    }


}
