package leib.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class testDao {
    @Autowired
    DeptDao deptDao;

    @Test
    public void A(){
        deptDao.queryAll();
    }

    @Test
    public void B(){
        deptDao.queryByID(new Long(1));
    }

}
