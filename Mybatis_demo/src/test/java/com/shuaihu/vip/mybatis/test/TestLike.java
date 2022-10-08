package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.SelectLike;
import org.shuaihu.vip.mybatis.mapper.SelectTable;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

import java.util.List;

public class TestLike {
    @Test
    public void TestSelectLike(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectLike mapper = sqLsession.getMapper(SelectLike.class);
        List<User> userToLike = mapper.getUserToLike("i");
        userToLike.forEach(s-> System.out.println(s));
    }
    @Test
    public void TestTable(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectTable mapper = sqLsession.getMapper(SelectTable.class);
        List<User> t_user = mapper.getUserByTable("t_user");
        t_user.forEach(user -> System.out.println(user));
        System.out.println(t_user);
    }
}
