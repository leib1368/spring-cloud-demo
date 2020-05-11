package leib.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author:Leib
 * @Date 2020/5/10 15:25
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9527 {
    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication_9527.class,args) ;
    }
}


//www.leib.com:9527/springcloud-provider-dept/dept/get/2