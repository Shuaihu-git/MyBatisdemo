package shuaihu.vip.mbg.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_EMP.emp_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_EMP.emp_name
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_EMP.age
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_EMP.sex
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_EMP.dept_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_EMP.emp_id
     *
     * @return the value of T_EMP.emp_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_EMP.emp_id
     *
     * @param empId the value for T_EMP.emp_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_EMP.emp_name
     *
     * @return the value of T_EMP.emp_name
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_EMP.emp_name
     *
     * @param empName the value for T_EMP.emp_name
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_EMP.age
     *
     * @return the value of T_EMP.age
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_EMP.age
     *
     * @param age the value for T_EMP.age
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_EMP.sex
     *
     * @return the value of T_EMP.sex
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_EMP.sex
     *
     * @param sex the value for T_EMP.sex
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_EMP.dept_id
     *
     * @return the value of T_EMP.dept_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_EMP.dept_id
     *
     * @param deptId the value for T_EMP.dept_id
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}