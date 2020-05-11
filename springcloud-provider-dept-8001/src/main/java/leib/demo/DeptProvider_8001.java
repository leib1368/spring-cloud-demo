package leib.demo;

import com.netflix.hystrix.contrib.sample.stream.HystrixConfigSseServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:20
 */
@SpringBootApplication
@EnableEurekaClient //服务启动后自动注册到Eureka
@EnableDiscoveryClient  //服务发现
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class,args);
    }

    //增加servlet
    @Bean
    public ServletRegistrationBean HystrixConfigSseServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixConfigSseServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
