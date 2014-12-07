package scheduling.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SchedulingAppConfig.class})
public class SchedulingAppConfigTest
{
    @Test
    public void test() throws InterruptedException
    {
        while(true) {
            Thread.sleep(1000);
            // should see the console logs something
        }
    }
}