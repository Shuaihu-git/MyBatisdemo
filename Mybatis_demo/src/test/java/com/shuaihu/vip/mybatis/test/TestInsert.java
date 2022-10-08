package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.InsertUser;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

public class TestInsert {
    @Test
    public void testInsert(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        InsertUser mapper = sqLsession.getMapper(InsertUser.class);
        User user=new User(null,"麻子","passwd",22,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
