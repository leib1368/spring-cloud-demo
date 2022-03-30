package leib.demo.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.override.MybatisMapperProxy;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import leib.demo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestPagePlus {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQueryPLUS() {
        Page<User> page = new Page<>(1,2);
        Page<User> userPage = userMapper.queryAll(page);

        System.out.println(userPage);
    }

    @Test
    public void testQuery() {
        Page<User> page = new Page<>(1,2);
        List<User> userList = userMapper.selectList(null);
        Page<User> userPage = userMapper.selectPage(page, null);

        System.out.println(userList);
        System.out.println(userPage);
    }
}
