package vip.shuaihu.www.pojo;

import java.util.List;

public class Dept {
    //部门编号
    private Integer deptid;
    //部门名称
    private String deptname;

    private List<Emp> emps;

    public Dept() {
    }

    public Dept(Integer deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
