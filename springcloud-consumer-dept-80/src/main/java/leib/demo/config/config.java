package leib.demo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:45
 */
@Configuration
public class config {
    //IRule
    //RoundRobinRule 轮询
    //RandomRule
    //AvailabilityFilteringRule
    //RetryRule



    @Bean
    @LoadBalanced   //Ribbon
    //配置均衡负载实现
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
