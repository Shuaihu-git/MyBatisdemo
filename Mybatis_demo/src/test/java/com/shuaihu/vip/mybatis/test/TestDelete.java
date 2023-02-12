package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.DeleteMore;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;
/**
 * 数据库删除测试
 * @Author 张帅虎
 * @Data 2023/2/12
 */

public class TestDelete {
    /**
     * 测试删除通过用户id批量删除用户信息
     */
    @Test
    public void deleteTest(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        DeleteMore mapper = sqLsession.getMapper(DeleteMore.class);
        int more = mapper.deleteMore("2,3,4,9");
        System.out.println(more);
    }
}
