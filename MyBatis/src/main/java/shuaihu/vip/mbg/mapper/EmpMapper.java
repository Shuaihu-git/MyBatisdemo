package shuaihu.vip.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shuaihu.vip.mbg.pojo.Emp;
import shuaihu.vip.mbg.pojo.EmpExample;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    Emp selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EMP
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    int updateByPrimaryKey(Emp record);
}