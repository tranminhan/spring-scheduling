package scheduling.annotation.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by atran on 12/7/14.
 */
@EnableScheduling
@Configuration
@ComponentScan(basePackages = "scheduling.annotation.component")
public class SchedulingComponentAppConfig
{
}
