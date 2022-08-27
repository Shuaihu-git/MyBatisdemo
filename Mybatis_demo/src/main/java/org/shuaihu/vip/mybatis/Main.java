package org.shuaihu.vip.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.shuaihu.vip.mybatis.mapper.UserMapper;
import org.shuaihu.vip.mybatis.pojo.User;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Main  {



    @AnnationTest(value = "aa", out = "", num = 0,findallUers = "")
    private String name;
    @AnnationTest(value = "name", out = "aa", num = 0,findallUers = "")
    public static void printA(){
        System.out.println("------");
    }
    @AnnationTest(value = "",out = "",num=0,findallUers ="用户所有信息为：")
     private String list;
    public static List<User> getDeclareList(){
        return listUser;
    }
    public static List<User> listUser;
    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userAll = mapper.findUserAll();
        listUser=userAll;

        Class clazzM=Main.class;
        Field lsit = clazzM.getDeclaredField("list");
        AnnationTest annationTest1=lsit.getAnnotation(AnnationTest.class);
        String replace = annationTest1.findallUers().concat(userAll.toString());
        System.out.println(replace);



        Class clazz=Main.class;
        Field field=clazz.getDeclaredField("name");
        AnnationTest annotation = (AnnationTest) field.getAnnotation(AnnationTest.class);
        System.out.println(annotation.value());

        Method out = clazz.getDeclaredMethod("printA");
        Annotation[] declaredAnnotations = out.getDeclaredAnnotations();
        AnnationTest annationTest=(AnnationTest)declaredAnnotations[0];
        Class<? extends AnnationTest> aClass = annationTest.getClass();
        Method out1 = aClass.getMethod("out");
        out1.invoke(annationTest);
        System.out.println("--------");

        AnnationTest outAnnotation = out.getAnnotation(AnnationTest.class);
        System.out.println(outAnnotation.getClass().getMethod("out").invoke(outAnnotation));
        System.out.println("getprintA");

        Method printA = clazz.getDeclaredMethod("printA");
        printA.invoke(clazz);
    }
}