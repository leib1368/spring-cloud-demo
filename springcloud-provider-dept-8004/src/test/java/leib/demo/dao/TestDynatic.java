package leib.demo.dao;

import com.baomidou.mybatisplus.core.override.MybatisMapperProxy;
import leib.demo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class TestDynatic {

//    @Autowired
//    private UserMapper userMapper;

    @Test
    public void testQueryPLUS() {
        //MybatisMapperProxy<UserMapper> mapperProxy = new MybatisMapperProxy<>();
    }
}
