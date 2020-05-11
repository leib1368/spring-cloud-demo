package leib.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author:Leib
 * @Date 2020/5/10 14C:38
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001{
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}
