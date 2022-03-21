package leib.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import leib.demo.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
