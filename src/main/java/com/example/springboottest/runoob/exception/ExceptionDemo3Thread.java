package com.example.springboottest.runoob.exception;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ExceptionDemo3Thread.java
 * @Description TODO
 * @createTime 2021年11月20日 11:02:00
 */
class MyThread extends Thread{
    public void run(){
        System.out.println("Throwing in " +"MyThread");
        throw new RuntimeException();
    }
}
class ExceptionDemo3Thread {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}
