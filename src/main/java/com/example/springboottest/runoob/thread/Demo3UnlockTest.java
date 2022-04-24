package com.example.springboottest.runoob.thread;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3DeadlockTest.java
 * @Description TODO
 * @createTime 2021年11月22日 17:32:00
 */
public class Demo3UnlockTest {
    public static String obj1 = "obj1";
    public static final Semaphore a1 = new Semaphore(1);
    public static String obj2 = "obj2";
    public static final Semaphore a2 = new Semaphore(1);

    public static void main(String[] args) {
        LockAa la = new LockAa();
        new Thread(la).start();
        LockBb lb = new LockBb();
        new Thread(lb).start();
    }
}


class LockAa implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                if (Demo3UnlockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    if (Demo3UnlockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + "LockA 锁 obj2 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockA 锁 obj1 失败");
                }
                Demo3UnlockTest.a1.release(); // 释放
                Demo3UnlockTest.a2.release();
                Thread.sleep(1000); // 马上进行尝试，现实情况下do something是不确定的
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class LockBb implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                if (Demo3UnlockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockB 锁住 obj2");
                    if (Demo3UnlockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockB 锁住 obj1");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + "LockB 锁 obj1 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockB 锁 obj2 失败");
                }
                Demo3UnlockTest.a1.release(); // 释放
                Demo3UnlockTest.a2.release();
                Thread.sleep(10 * 1000); // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}