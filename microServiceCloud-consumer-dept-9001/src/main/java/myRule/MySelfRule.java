package myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @Time: 2019/11/24 22:41
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandFiveTimeRule();
    }
}
