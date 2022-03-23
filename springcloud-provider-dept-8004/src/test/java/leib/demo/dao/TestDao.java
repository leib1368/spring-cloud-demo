package leib.demo.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import leib.demo.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class TestDao {
    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//    }
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        Page<?> page = new Page<>();
        page.setCurrent(new Long(1));
        page.setSize(new Long(3));
        Page<User> userList = userMapper.queryAll(page);
        System.out.println(userList);
    }
}
