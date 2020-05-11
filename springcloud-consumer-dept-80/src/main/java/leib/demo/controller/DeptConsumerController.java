package leib.demo.controller;

import leib.demo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    RestTemplate restTemplate ;
    //提供多种便捷访问远程http服务的方法，简单的Restful服务模板
    // url ,实体, class<T> response type

    //ribbon实现的时候应该是变量
    //private  static final String REST_URL_PREFIX = "http://localhost:8001" ;
    private  static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT" ;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept ){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/queryAll")
    public List<Dept> list(  ){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/queryAll",List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id ){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
}
