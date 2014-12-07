package scheduling.properties;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by atran on 12/7/14.
 */
@Component
public class PropertyBaseCronWorker
{
    @Scheduled(cron = "${cron}")
    public void work() {
        System.out.println("A property-based-cron trigger is working");
    }
}
