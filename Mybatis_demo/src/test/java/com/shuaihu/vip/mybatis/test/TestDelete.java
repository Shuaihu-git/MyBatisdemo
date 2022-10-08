package com.shuaihu.vip.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.shuaihu.vip.mybatis.mapper.DeleteMore;
import org.shuaihu.vip.mybatis.utils.SQLSessionUtils;

public class TestDelete {
    @Test
    public void deleteTest(){
        SqlSession sqLsession = SQLSessionUtils.getSQLsession();
        DeleteMore mapper = sqLsession.getMapper(DeleteMore.class);
        int more = mapper.deleteMore("2,3,4,9");
        System.out.println(more);
    }
}
