package scheduling.annotation.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.PeriodicTrigger;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by atran on 12/7/14.
 */
@EnableScheduling
@Configuration
public class AppConfigConfigurer implements SchedulingConfigurer
{
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar)
    {
        taskRegistrar.setScheduler(taskScheduler());
        taskRegistrar.addTriggerTask(new Runnable()
        {
            @Override
            public void run()
            {
                myTask().work();
            }
        },
        new PeriodicTrigger(5, TimeUnit.SECONDS));
    }

    @Bean
    public Worker myTask()
    {
        return new Worker();
    }

    @Bean(destroyMethod = "shutdown")
    public ScheduledExecutorService taskScheduler()
    {
        return Executors.newScheduledThreadPool(1);
    }
}
