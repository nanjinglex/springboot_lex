package com.example.springboottest.javastack;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1Schedule.java
 * @Description
 * @createTime 2022年02月08日 15:23:00
 */
public class Demo1Schedule {
    public static void main(String[] args) {
        sleepTask();
    }

    /**
     * 休眠实现定时任务
     * 来源公众号：Java技术栈
     */
    private static void sleepTask() {
        new Thread(() -> {
            while (true) {
                System.out.println("hi, 欢迎关注：Java技术栈");

                try {
                    // 每隔3秒执行一次
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    /**
     * timer定时任务
     * 来源公众号：Java技术栈
     */
    private static void timerTask() throws InterruptedException {
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hi, 欢迎关注：Java技术栈");
            }
        };

        // 第一次任务延迟时间
        long delay = 2000;

        // 任务执行频率
        long period = 3 * 1000;

        // 开始调度
        timer.schedule(timerTask, delay, period);

        // 指定首次运行时间
// timer.schedule(timerTask, DateUtils.addSeconds(new Date(), 5), period);

        Thread.sleep(20000);

        // 终止并移除任务
        timer.cancel();
        timer.purge();
    }


    /**
     * 线程池定时任务
     * 来源公众号：Java技术栈
     */
    //这是一个按固定频率调度的任务，创建了 10 个核心线程数，首次执行延迟 2 秒，后续每 3 秒执行一次。
    //
    //这种方式简单、好用，避免了使用 Timer 带来的各种问题，推荐使用这种实现方式。
    public static void poolTask(){
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);

        pool.scheduleAtFixedRate(() -> {
            System.out.println("hi, 欢迎关注：Java技术栈");
        }, 2000, 3000, TimeUnit.MILLISECONDS);
    }

}
