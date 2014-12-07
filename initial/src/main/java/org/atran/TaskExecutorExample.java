package org.atran;

import org.springframework.core.task.TaskExecutor;

/**
 * Created by atran on 12/6/14.
 */
public class TaskExecutorExample
{
    private class PrintMessageTask implements Runnable
    {

        private String message;

        public PrintMessageTask(String message)
        {
            this.message = message;
        }

        @Override
        public void run()
        {
            System.out.println(message);
        }
    }

    private TaskExecutor taskExecutor;

    public TaskExecutorExample(TaskExecutor taskExecutor)
    {
        this.taskExecutor = taskExecutor;
    }

    public void printMessages()
    {
        for (int i = 0; i < 25; i++)
        {
            taskExecutor.execute(new PrintMessageTask("Message " + i));
        }
    }
}
