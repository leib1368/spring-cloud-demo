package leib.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:20
 */
@SpringBootApplication
@EnableDiscoveryClient  //服务发现
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class,args);
    }
}
