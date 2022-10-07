package com.shuaihu.vip.mapper;

import com.shuaihu.vip.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    List<Dept> getDeptList();

    /**
     * 通过分步查询员工信息以及员工部门信息的第二步
     * @param deptid
     * @return
     * 多对一
     */
    Dept getEmpAndDeptByDeptId(@Param("deptid")Integer deptid);

    /**
     * 查询部门以及部门中的员工信息
     * 一对多
     * @param deptid
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptid")Integer deptid);

    /**
     * 通过分步查询部门以及部门中的员工信息的第一步
     * @param deptid
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptid")Integer deptid);
}
