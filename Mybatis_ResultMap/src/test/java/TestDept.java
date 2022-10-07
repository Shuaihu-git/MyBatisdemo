import com.shuaihu.vip.mapper.DeptMapper;
import com.shuaihu.vip.pojo.Dept;
import com.shuaihu.vip.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDept {
    @Test
    public void testGetDeptList(){
        SqlSession session = SqlSessionUtils.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> deptList = mapper.getDeptList();
        System.out.println(deptList);
    }
    @Test
    public void testDeptAndEmpByDeptId(){
        SqlSession session = SqlSessionUtils.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
    }
    @Test
    public void testDeptAndEmpBySteps(){
        SqlSession session = SqlSessionUtils.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(deptAndEmpByStepOne);
    }
}
