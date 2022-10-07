import com.shuaihu.vip.mapper.EmpMapper;
import com.shuaihu.vip.pojo.Emp;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestEmp {
    @Test
    public void getEmpByEmpid(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);
    }
    @Test
    public void testGetEmpList(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.getEmpList();
        System.out.println(empList);
    }
    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByEmpId(3);
        System.out.println(empAndDeptByEmpId);
    }
    @Test
    public void testGetEmpAndDeptByEmpIdToList(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> empAndDeptByEmpId = mapper.getEmpAndDeptByEmpIdToList();
        System.out.println(empAndDeptByEmpId);
    }
    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession session = SqlSessionUtils.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByStepOne(3);
        System.out.println(empAndDeptByEmpId);
    }
}
