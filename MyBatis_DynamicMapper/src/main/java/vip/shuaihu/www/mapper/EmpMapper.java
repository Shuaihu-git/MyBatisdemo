package vip.shuaihu.www.mapper;

import org.apache.ibatis.annotations.Param;
import vip.shuaihu.www.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 动态SQl
     * @param emp
     * @return
     */
    List<Emp> getListByDynamic(Emp emp);

    /**
     * 使用Choose标签查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getListByChoose(Emp emp);

    /**
     * 使用foreach标签批量添加数据
     * @param emps
     */
    void InsertUsersByBatch(@Param("emps") List<Emp> emps);

    /**
     * 使用foreach标签批量删除员工信息
     * @param empids
     */
    void deleteUsersByBatch(@Param("empids") Integer[] empids);

    /**
     * 模糊删除
     * @param empnames
     * @return
     */
    int deleteUsersByLike(@Param("empnames")String empnames);
}
