package leib.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import leib.demo.bean.User;
import org.springframework.stereotype.Repository;


public interface UserMapper extends BaseMapper<User> {
       Page<User> queryAll (Page<?> page);
}
