package shuaihu.vip.cache.mapper;

import org.apache.ibatis.annotations.Param;
import shuaihu.vip.pojo.Emp;

/**
 * 测试MyBatis的一级缓存
 * @Author 张帅虎
 * @Data 2023/2/13
 */
public interface CacheMapper {
    /**
     * 通过员工id来获取员工信息
     * @param eid
     * @return返回员工信息
     */
    Emp getEmpById(@Param("eid") Integer eid);
}
