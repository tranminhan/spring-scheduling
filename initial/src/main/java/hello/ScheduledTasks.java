package hello;

/**
 * Created by atran on 12/6/14.
 */
@org.springframework.scheduling.annotation.EnableScheduling
public class ScheduledTasks
{
    private static final java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("HH:mm:ss");

    @org.springframework.scheduling.annotation.Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new java.util.Date()));
    }

    @org.springframework.scheduling.annotation.Scheduled(cron = "0/5 * * * * *")
    public void testTask1() {
        System.out.println("Task 1 ... ");
    }

    @org.springframework.scheduling.annotation.Scheduled(cron = "0/5 * * * * *")
    public void testTask2() {
        System.out.println("Task 2 ... ");
    }
}
