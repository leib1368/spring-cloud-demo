package leib.demo.service;

import leib.demo.bean.User;
import leib.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        return userMapper.selectList(null);
    }
}
