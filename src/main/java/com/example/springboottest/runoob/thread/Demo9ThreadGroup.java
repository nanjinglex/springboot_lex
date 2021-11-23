package com.example.springboottest.runoob.thread;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo9ThreadGroup.java
 * @Description
 * @createTime 2021年11月23日 11:45:00
 */
public class Demo9ThreadGroup extends Thread{
    public static void main(String[] args) {
        Demo9ThreadGroup t1 = new Demo9ThreadGroup();
        t1.setName("thread1");
        t1.start();
        ThreadGroup currentGroup =
                Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
    }
}
