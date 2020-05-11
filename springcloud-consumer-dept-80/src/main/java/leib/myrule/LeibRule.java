package leib.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Leib
 * @Date 2020/5/9 20:40
 */
@Configuration
public class LeibRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
