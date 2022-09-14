package org.shuaihu.vip.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.shuaihu.vip.mybatis.pojo.User;

import java.util.List;

public interface SelectLike {
    /**
     * 依据ID模糊查询用户信息
     * @return
     */
    List<User> getUserToLike(@Param("username") String username);
}
