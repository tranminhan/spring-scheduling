package org.atran;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by atran on 12/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TaskExecutorExampleTest
{
    @Autowired
    TaskExecutorExample example;

    @Test
    public void test1()
    {
        assertNotNull(example);
        example.printMessages();
    }
}
