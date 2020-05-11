package leib.demo;

import leib.myrule.LeibRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author:Leib
 * @Date 2020/5/9 14:09
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = LeibRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
