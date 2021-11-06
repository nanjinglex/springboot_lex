package com.example.springboottest.quartz;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName TimerTest.java
 * @Description TODO
 * @createTime 2021年07月29日 09:38:00
 */
public class TimerTest {

    public static void main(String[] args) {
        // 创建任务队列
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(10);
        // 执行任务 1
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("进入 Schedule：" + new Date());
            // 模拟异常
            int num = 8 / 0;
            System.out.println("Run Schedule：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
        // 执行任务 2
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Run Schedule2：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
    }





}
