package leib.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import leib.demo.entity.Dept;
import leib.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:15
 */
@RestController

public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryByID(id);

        if(dept==null){
            throw new RuntimeException("id=>"+id+"不存在的该id");
        }

        return dept;
    }

    //@GetMapping("/dept/get/{id}")
    public Dept hystrixGet(@PathVariable("id") Long id){

        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"不存在的该id")
                .setDb_source("no db")
                ;
    }

}
