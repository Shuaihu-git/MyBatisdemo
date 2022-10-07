package com.shuaihu.vip.mapper;

import org.apache.ibatis.annotations.Param;

public interface DeleteUsers {
    /**
     * 依据用户名称来删除用户信息
     * @param username 待删用户名称
     */
    void deleteUserByUserName(@Param("username")String username);

    /**
     * 批量删除用户数据
     * @param username 所要满足的条件
     * @return 受影响的行数
     */
    int deleteUserByBatch(@Param("username")String username);

}
