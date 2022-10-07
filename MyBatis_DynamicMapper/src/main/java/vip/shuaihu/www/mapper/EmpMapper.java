package vip.shuaihu.www.mapper;

import vip.shuaihu.www.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> getListByDynamic(Emp emp);
    List<Emp> getListByChoose(Emp emp);
}
