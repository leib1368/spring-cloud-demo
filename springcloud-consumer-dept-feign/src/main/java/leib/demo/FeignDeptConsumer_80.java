package leib.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Author:Leib
 * @Date 2020/5/9 14:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"leib.demo"})
@ComponentScan("leib.demo")
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
