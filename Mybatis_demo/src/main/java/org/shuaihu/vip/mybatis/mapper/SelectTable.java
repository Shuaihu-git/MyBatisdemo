package org.shuaihu.vip.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.shuaihu.vip.mybatis.pojo.User;

import java.util.List;

public interface SelectTable {
    List<User> getUserByTable(@Param("tablename")String tablename);
}
