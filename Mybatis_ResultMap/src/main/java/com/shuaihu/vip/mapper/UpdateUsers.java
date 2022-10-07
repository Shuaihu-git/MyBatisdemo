package com.shuaihu.vip.mapper;

import com.shuaihu.vip.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UpdateUsers {
    /**
     * 更新用户信息
     * @param user 待更新的用户数据
     * @return 0代表失败非0代表成功
     */
    int updateUser(User user);

    /**
     * 更新用户信息
     * @param username
     * @return
     */
    int updateUserByUserName(@Param("username")String username);
}
