package com.shuaihu.vip.mapper;

import com.shuaihu.vip.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empid")Integer empid);
    List<Emp> getEmpList();
    Emp getEmpAndDeptByEmpId(@Param("empid")Integer empid);

    /**
     * 通过分步查询员工信息以及员工部门信息的第一步
     * @param empid
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empid")Integer empid);
    List<Emp> getEmpAndDeptByEmpIdToList();

    /**
     * 通过分步查询部门以及部门中的员工信息的第一步
     * @param deptid
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptid")Integer deptid);
}
