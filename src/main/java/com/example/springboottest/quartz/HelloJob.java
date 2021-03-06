package com.example.springboottest.quartz;


import org.quartz.Job;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName HelloJob.java
 * @Description TODO
 * @createTime 2021年07月28日 14:14:00
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Object tv1 = context.getTrigger().getJobDataMap().get("t1");
        Object tv2 = context.getTrigger().getJobDataMap().get("t2");
        Object jv1 = context.getJobDetail().getJobDataMap().get("j1");
        Object jv2 = context.getJobDetail().getJobDataMap().get("j2");
        Object sv = null;
        try {
            sv = context.getScheduler().getContext().get("skey");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        System.out.println(tv1 + ":" + tv2);
        System.out.println(jv1 + ":" + jv2);
        System.out.println(sv);
        System.out.println("hello:" + LocalDateTime.now());
    }

    public static void main(String[] args) {
        //创建一个scheduler
        Scheduler scheduler = null;
        try {
            scheduler = StdSchedulerFactory.getDefaultScheduler();
//            scheduler.getContext().put("skey", "svalue");

            HashMap<String, String> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("skey", "svalue");
            objectObjectHashMap.put("skey1", "svalue1");

            scheduler.getContext().putAll(objectObjectHashMap);


            //创建一个Trigger
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .usingJobData("t1", "tv1")
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3)
                            .repeatForever()).build();
            trigger.getJobDataMap().put("t2", "tv2");

            //创建一个job
            JobDetail job = JobBuilder.newJob(HelloJob.class)
                    .usingJobData("j1", "jv1")
                    .withIdentity("myjob", "mygroup").build();
            job.getJobDataMap().put("j2", "jv2");

            //注册trigger并启动scheduler
            scheduler.scheduleJob(job, trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
