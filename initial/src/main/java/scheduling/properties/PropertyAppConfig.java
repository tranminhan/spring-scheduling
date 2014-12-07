package scheduling.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by atran on 12/7/14.
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = "scheduling.properties")
@PropertySource("classpath:application.properties")
public class PropertyAppConfig
{
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
