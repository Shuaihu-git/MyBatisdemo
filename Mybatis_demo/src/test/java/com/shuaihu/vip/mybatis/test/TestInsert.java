package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.InsertUser;
import org.shuaihu.vip.mybatis.pojo.User;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;
/**
 * 数据插入功能测试
 * @Author 张帅虎
 * @Data 2023/2/12
 */
public class TestInsert {
    /**
     * 测试插入用户信息
     */
    @Test
    public void testInsert(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        InsertUser mapper = sqLsession.getMapper(InsertUser.class);
        User user=new User(null,"麻子","passwd",22,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
