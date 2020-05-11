package leib.demo.controller;

import leib.demo.entity.Dept;
import leib.demo.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:43
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService= null;


    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id ){
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list( ){
        return this.deptClientService.queryAll();
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept ){
        return this.deptClientService.addDept(dept);
    }

}
