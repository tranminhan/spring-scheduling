package scheduling.annotation.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by atran on 12/7/14.
 */
@Component
public class MyTaskComponent
{
    @Scheduled(fixedRate = 1000)
    public void work() {
        System.out.println("My component task is executed");
    }
}
