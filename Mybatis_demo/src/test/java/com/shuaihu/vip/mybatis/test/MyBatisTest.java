package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.UserMapper;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 测试更新用户信息
     */
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

    /**
     * 测试删除用户信息
     */
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

    /**
     * 测试通过ID来获得用户信息
     */
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

    /**
     * 测试通过用户名称来获取用户信息
     * @throws IOException
     */
    @Test
    public void testUserInfoByUsername() throws IOException {
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        UserMapper mapper = sqLsession.getMapper(UserMapper.class);
        User user = mapper.getUserInfoByUserName("王五");
        System.out.println(user);

    }

    /**
     * 测试检查用户登录
     */
    @Test
    public void  testCheckLogin(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        UserMapper mapper = sqLsession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("王五", "root");
        System.out.println(user);

    }

    /**
     * 测试通过Map集合，来检查登录状态
     */
    @Test
    public void  testCheckLoginByMap(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        UserMapper mapper = sqLsession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","王五");
        map.put("passwd","root");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);

    }

    /**
     * 测试插入用户信息
     */
    @Test
    public void  testInsertUser(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        UserMapper mapper = sqLsession.getMapper(UserMapper.class);
        int result = mapper.insertUserByUser(new User(null, "admin", "root..", 23, "男", "1231313553@qq.com"));
        System.out.println(result);
    }

    /**
     * 测试通过@Param注解来登录
     */
    @Test
        public void  testCheckLoginByParam(){
            SqlSession sqLsession = SQLSessionUtils.getSQLsession();
            UserMapper mapper = sqLsession.getMapper(UserMapper.class);
            User user = mapper.checkLoginByParam("admin", "root..");
            System.out.println(user);
    }


}
