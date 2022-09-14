package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.SelectParam;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TsetSelect {
    @Test
    public void Test(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam mapper = sqLsession.getMapper(SelectParam.class);
        System.out.println(mapper.SelectUserById(5));
    }
    @Test
    public void TestList(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam selectParam = sqLsession.getMapper(SelectParam.class);
        List<User> list = selectParam.selectUserByList();
        list.forEach(userlist-> System.out.println(userlist));
    }
    @Test
    public void TestCount(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam mapper = sqLsession.getMapper(SelectParam.class);
        System.out.println(mapper.getUserCount());

    }
    @Test
    public void TestMap(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam mapper = sqLsession.getMapper(SelectParam.class);
        Map<String, Object> userMapById = mapper.getUserMapById(9);
        userMapById.forEach((map, map1) -> System.out.println(map + "->>>>>>" + map1));
    }
    @Test
    public void TestGetUserMap(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam mapper = sqLsession.getMapper(SelectParam.class);
        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
        allUserToMap.forEach(string-> System.out.println(string));
    }
    @Test
    public void TestGetALLUserMap(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectParam mapper = sqLsession.getMapper(SelectParam.class);
        Map<String,Object> allUserToMap = mapper.getUserToMap();
        System.out.println(allUserToMap);
        Map<Integer,Object> mapMap=new HashMap<>();


            mapMap.put(1,allUserToMap);


        mapMap.forEach(((integer, map) -> System.out.println(integer+"->>"+map)));
        //allUserToMap.forEach((string,object)-> System.out.println(string+"->>"+object));
    }
}
