package leib.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("leib.demo.dao")
public class DeptProvider_8004 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8004.class, args);
    }
}
