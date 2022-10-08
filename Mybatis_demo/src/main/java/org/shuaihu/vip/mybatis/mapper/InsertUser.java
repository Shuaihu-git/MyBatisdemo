package org.shuaihu.vip.mybatis.mapper;

import org.shuaihu.vip.mybatis.pojo.User;

public interface InsertUser {
    /**
     * 新增用户数据
     * @param user
     */
    void insertUser(User user);
}
