package com.shuaihu.vip.mapper;

import com.shuaihu.vip.pojo.User;

public interface InsertUsers {
    /**
     * 新增一个用户
     * @param user 用户数据
     */
    void insertUser(User user);

    /**
     * 通过主键新增一条用户数据
     * @param user 新增用户数据
     */
    void insertUserByKey(User user);
}
