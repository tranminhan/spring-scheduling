package scheduling.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by atran on 12/7/14.
 */
@EnableScheduling
@Configuration
public class SchedulingAppConfig
{

    @Bean
    public MyTask task()
    {
        return new MyTask();
    }
}
