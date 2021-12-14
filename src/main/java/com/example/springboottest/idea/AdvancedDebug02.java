package com.example.springboottest.idea;

public class AdvancedDebug02 {
    public static void main(String[] args) {
        new Thread(new TaskTest1(), "线程1").start();
        new Thread(new TaskTest2(), "线程2").start();
        System.out.println("thread test");
    }

    static class TaskTest1 implements Runnable{
        @Override
        public void run() {
            System.out.println("task1执行了");
        }
    }
    static class TaskTest2 implements Runnable{
        @Override
        public void run() {
            System.out.println("task2执行了");
        }
    }
}
