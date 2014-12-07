package scheduling.annotation;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by atran on 12/7/14.
 */
public class MyTask
{
    @Scheduled(fixedRate = 1000)
    public void work() {
        System.out.println("My task is executed");
    }
}
