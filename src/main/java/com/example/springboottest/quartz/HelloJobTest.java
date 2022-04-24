package com.example.springboottest.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName HelloJob.java
 * @Description TODO
 * @createTime 2022年01月04日 18:09:00
 */
public class HelloJobTest implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("quartzTset");
        System.out.println(context);
    }
}
