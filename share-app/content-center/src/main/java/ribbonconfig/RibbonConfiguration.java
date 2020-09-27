package ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhao
 * @className RibbonConfiguration
 * @Description TODO
 * @Date 2020/9/25
 * @Version 1.0
 **/
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //c
        return new RandomRule();
    }
}
