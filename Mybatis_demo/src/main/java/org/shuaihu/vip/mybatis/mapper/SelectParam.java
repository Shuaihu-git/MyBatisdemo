package org.shuaihu.vip.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.shuaihu.vip.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface SelectParam {
    /**
     * 依据id查询用户信息
     */
    User SelectUserById(@Param("id")Integer id);
    /**
     * 查询所有的用户信息
     */
    List<User> selectUserByList();

    /**
     * 查询用户的总数
     * @return 返回用户的数量
     */
    Integer getUserCount();

    /**
     * 根据用户ID来将数据以map返回
     * @param Id
     * @return
     */
    Map<String,Object> getUserMapById(@Param("Id")Integer Id);

    /**
     * 查询所有信息返回到list集合中
     * @return
     */
    List<Map<String,Object>>  getAllUserToMap();

    @MapKey("id")
    Map<String,Object> getUserToMap();
}
