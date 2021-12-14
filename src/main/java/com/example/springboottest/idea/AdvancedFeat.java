package com.example.springboottest.idea;

public class AdvancedFeat {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        printA();
        System.out.println(a + b);


        for (int i = 0; i < 100; i++) {
            System.out.println("爱你" + i);
        }

        new Thread(new TaskTest1(), "线程1").start();
        new Thread(new TaskTest2(), "线程2").start();
        System.out.println("thread test");
    }

    private static void printA() {
        int c = 3;
        int d = 4;
        System.out.println("printA");
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
