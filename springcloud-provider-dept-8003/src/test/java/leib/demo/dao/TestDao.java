package leib.demo.dao;

import leib.demo.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDao {
    @Autowired
    DeptDao deptDao;

    @Test
    public void C(){
        Dept dept = new Dept();
        dept.setDeptno(new Long(111)).setDname("q1");
        //int i = deptDao.addDept();
        //System.out.println(i);
    }

    @Test
    public void A(){
        List<Dept> depts = deptDao.queryAll();
        System.out.println(depts);
    }

    @Test
    public void B(){
        deptDao.queryByID(new Long(1));
    }

}
