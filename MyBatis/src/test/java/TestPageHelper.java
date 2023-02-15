import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import shuaihu.vip.mbg.mapper.EmpMapper;
import shuaihu.vip.mbg.pojo.Emp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestPageHelper {
    /**
     * 测试分页
     * limit，index，pageSize
     * index：当前页的起始索引
     * pageSize：每页显示的条数
     * pageNum：当前页的页码
     * index=（pageNum-1）*pageSize
     * 使用MyBatis分页插件步骤
     * 1、在Mybatis查询之前开启分页
     * PageHelper.startPage(int pageNum,int pageSize);
     * 2、 在查询之后获取相关信息
     *  PageInfo <Emp> page = new PageInfo<>(list,5);
     *  list:表示分页数据
     *  5：表示当前导航分页数量
     */
    @Test
    public void testPageHelper(){
        SqlSession sqlSession=null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //启用分页插件
//            Page<Object> page = PageHelper.startPage(1, 10);

            Page<Object> page1 = PageHelper.startPage(4, 3);
            List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));
            //获取导航分页逻辑
            PageInfo <Emp> page = new PageInfo<>(emps,5);
            //PageInfo{pageNum=4, pageSize=3, size=3, startRow=10, endRow=12, total=38, pages=13
            // prePage=3, nextPage=5, isFirstPage=false, isLastPage=false, hasPreviousPage=true, hasNextPage=true,
            // navigatePages=5, navigateFirstPage=2, navigateLastPage=6, navigatepageNums=[2, 3, 4, 5, 6]}
            System.out.println(page);
            //Page{count=true, pageNum=1, pageSize=10, startRow=0, endRow=10, total=12, pages=2,
            // reasonable=false, pageSizeZero=false}[Emp{empId=2, empName='李四', age=21, sex='女',
            // deptId=2}, Emp{empId=3, empName='王五', age=21, sex='女', deptId=1},
            // Emp{empId=4, empName='张三', age=23, sex='男', deptId=3}, Emp{empId=5, empName='麻子',
            // age=24, sex='男', deptId=4}, Emp{empId=6, empName='王二', age=22, sex='女', deptId=5},
            // Emp{empId=8, empName='002', age=21, sex='男', deptId=4}, Emp{empId=189, empName='张三',
            // age=22, sex='男', deptId=null}, Emp{empId=199, empName='test1', age=15, sex='男', deptId=1},
            // Emp{empId=210, empName='null', age=null, sex='null', deptId=null}, Emp{empId=211,
            // empName='test2', age=15, sex='男', deptId=1}]
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
