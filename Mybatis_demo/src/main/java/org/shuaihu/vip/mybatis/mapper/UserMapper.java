package org.shuaihu.vip.mybatis.mapper;

import org.shuaihu.vip.mybatis.pojo.User;

import java.util.List;

/**
 * @Author 张帅虎
 * @Data 2022/8/6
 */
public interface UserMapper {
    /**
     * MyBatis的两个一致
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中的SQL语句的id要和mapper接口的方法名一致
     *
     *
     *表——实体类——mapper接口——映射文件
     */

    /**
     * 增加用户信息
     */
    int insertUser();
    /**
     * 修改用户信息
     */
    void updateUser();
    /**
     * 删除用户信息
     */
    void deleteUser();
    /**
     * 根据ID返回用户信息
     *
     */
    User getUserById();
    /**
     * 返回表中的所有用户信息
     */
    List<User> findUserAll();

}
