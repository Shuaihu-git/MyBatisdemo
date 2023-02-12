package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.SelectLike;
import org.shuaihu.vip.mybatis.mapper.SelectTable;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

import java.util.List;

/**
 * 测试模糊功能
 * @Author 张帅虎
 * @Data 2023/2/12
 */
public class TestLike {
    /**
     * 测试模糊查询
     */
    @Test
    public void testSelectLike(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectLike mapper = sqLsession.getMapper(SelectLike.class);
        List<User> userToLike = mapper.getUserToLike("i");
        userToLike.forEach(s-> System.out.println(s));
    }

    /**
     * 通过表名来获取表里的所有用户数据
     */
    @Test
    public void testTable(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        SelectTable mapper = sqLsession.getMapper(SelectTable.class);
        List<User> t_user = mapper.getUserByTable("t_user");
        t_user.forEach(user -> System.out.println(user));
        System.out.println(t_user);
    }
}
