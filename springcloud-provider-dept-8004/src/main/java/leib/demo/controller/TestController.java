package leib.demo.controller;

import leib.demo.bean.User;
import leib.demo.dao.UserMapper;
import leib.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    IUserService userService;

    @GetMapping("/queryAll")
    public List<User> queryAll(){
        return  userService.queryAll();
    }
}
