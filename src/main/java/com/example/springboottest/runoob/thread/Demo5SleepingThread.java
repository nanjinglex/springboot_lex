package com.example.springboottest.runoob.thread;

/**
 * 线程挂起 join
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5SleepingThread.java
 * @Description TODO
 * @createTime 2021年11月23日 09:30:00
 */
public class Demo5SleepingThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;
    public Demo5SleepingThread() {
        super("" + ++threadCount);
        start();
    }
    @Override
    public String toString() {
        return "#" + getName() + ": " + countDown;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0)
                return;
            try {
                sleep(100);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args)
            throws InterruptedException {
        for (int i = 0; i < 5; i++)
            new Demo5SleepingThread().join();
        System.out.println("线程已被挂起");


        int a =4;
        System.out.println(a++);

        int b = 4;
        System.out.println(++b);
    }
}
