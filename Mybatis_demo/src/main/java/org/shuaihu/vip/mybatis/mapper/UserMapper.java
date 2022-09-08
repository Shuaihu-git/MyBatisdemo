package org.shuaihu.vip.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.shuaihu.vip.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

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
    /**
     * 根据用户名来查询用户的所有信息
     *
     */
    User getUserInfoByUserName(String username);

    /**
     * 验证用户名和用户密码
     * @param username
     * @param passwd
     * @return
     */
    User checkLogin(String username,String passwd);
    /**
     * 验证用户名和用户密码(以参数为map的情况)
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加一个用户数据
     * @param user
     * @return
     */
    int insertUserByUser(User user);

    /**
     * 验证登录（以@param注解的方式）
     * @param username 用户名
     * @param passwd 密码
     * @return 当前用户的数据
     */
    User checkLoginByParam(@Param("username")String username,@Param("passwd")String passwd);

}
