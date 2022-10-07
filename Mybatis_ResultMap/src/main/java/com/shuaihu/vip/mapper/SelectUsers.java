package com.shuaihu.vip.mapper;

import com.shuaihu.vip.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectUsers {
    /**
     * 查询所有用户数据
     * @return 返回在一个list集合当中
     */
    List<User> getAllUsers();


    /**
     *
     */
    User selectUserByUserName(@Param("user_name")String user_name);

    /**
     * 通过用户名称模糊查询
     * @param user_name 用户名称
     * @return 查询出的数据
     */
    List<User> selectLikeByUserName(@Param("user_name")String user_name);
}
