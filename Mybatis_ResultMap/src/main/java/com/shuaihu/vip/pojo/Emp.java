package com.shuaihu.vip.pojo;

public class Emp {

    private Integer empid;
    private String empname;
    private Integer age;
    private String sex;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer empid, String empname, Integer age, String sex) {
        this.empid = empid;
        this.empname = empname;
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
