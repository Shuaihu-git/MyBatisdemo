import com.google.zxing.common.detector.MathUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import shuaihu.vip.mbg.mapper.DeptMapper;
import shuaihu.vip.mbg.mapper.EmpMapper;
import shuaihu.vip.mbg.mapper.PostMapper;
import shuaihu.vip.mbg.mapper.UserMapper;
import shuaihu.vip.mbg.pojo.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestDept {
    /**
     * 测试部门信息
     */
    @Test
    public void testDept(){
        InputStream resourceAsStream =null;
        try {
           resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.selectByExample(new DeptExample());
        System.out.println(depts);


    }
    /**
     * 测试员工信息
     */
    @Test
    public void testEmp(){
        SqlSession sqlSession=null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*EmpExample empExample = new EmpExample();
        empExample.createCriteria().andAgeGreaterThanOrEqualTo(20).andDeptIdBetween(1,5);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectByExample(empExample);
        */
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //mapper.insert(new Emp(null,"mazi",22,"男",3));
        //mapper.updateByPrimaryKey(new Emp(213,"mazi",18,"女",3));
        mapper.updateByPrimaryKeySelective(new Emp(213,"mazi",null,"男",3));
        System.out.println();
    }
    /**
     * 测试招聘职位信息
     */
    @Test
    public void testPost(){
        SqlSession sqlSession=null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PostExample postExample = new PostExample();
        postExample.createCriteria();
        PostMapper mapper = sqlSession.getMapper(PostMapper.class);
        List<Post> posts = mapper.selectByExample(postExample);
        //System.out.println(posts);

        String filePath="D:/File"+File.separator+"职位信息.txt";
        try {
            /*FileOutputStream fileInputStream = new FileOutputStream(new File(filePath));
            String postsContent = posts.toString();
            fileInputStream.write(postsContent.getBytes(StandardCharsets.UTF_8));*/
            FileInputStream fileInputStream1 = new FileInputStream(new File(filePath));
            System.out.println(new File(filePath).getTotalSpace());
            int length= (int) Math.round((int)Math.pow(10,1)*new File(filePath).length()*(double) 1024*1024/Math.pow(10,1));
            System.out.println(length);
            byte[] bytes=new byte[length];
            int read = fileInputStream1.read(bytes);
            System.out.println(new String(bytes,0,read));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
