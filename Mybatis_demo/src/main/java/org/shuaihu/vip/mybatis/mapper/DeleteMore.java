package org.shuaihu.vip.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

public interface DeleteMore {
    /**
     * 批量删除
     */
    int deleteMore(@Param("ids")String ids);
}
