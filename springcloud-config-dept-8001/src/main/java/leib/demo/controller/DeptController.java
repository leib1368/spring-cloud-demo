package leib.demo.controller;

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

    @Autowired
    private DiscoveryClient client ;

    @PostMapping("/dept/add")
    public boolean add(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryByID(id);
    }

    @GetMapping("/dept/queryAll")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    //注册进来的微服务， 获取一些信息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services:"+services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach(instance-> System.out.println(
                instance.getHost()+"\t"+
                instance.getPort()+"\t"+
                instance.getUri()+"\t"+
                instance.getServiceId()
                )
        );
        return this.client;
    }
}
