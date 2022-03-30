package leib.demo.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import leib.demo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestPageHelper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery1() {
        PageHelper.startPage(1, 2);
        List<User> users = userMapper.queryAll2();
        System.out.println(users);
    }
    @Test
    public void testQuery2() {
        //PageHelper.startPage(1, 2);
        //List<User> users = userMapper.selectList(null);
        Page<User> page = new Page<>(1,3);
        IPage<User> users =userMapper.queryAll(page);
        System.out.println(users);

    }
}
