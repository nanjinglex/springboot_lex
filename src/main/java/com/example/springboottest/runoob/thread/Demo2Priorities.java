package com.example.springboottest.runoob.thread;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2Priorities.java
 * @Description TODO
 * @createTime 2021年11月22日 16:52:00
 */
public class Demo2Priorities extends Thread {
    private int countDown = 5;
    private volatile double d = 0;

    public Demo2Priorities(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            for (int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double) i;
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        new Demo2Priorities(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++)
            new Demo2Priorities(Thread.MIN_PRIORITY);
    }
}

