package com.example.springboottest.runoob.thread;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo6ThreadInterrupt.java
 * @Description TODO
 * @createTime 2021年11月23日 10:21:00
 */
public class Demo6ThreadInterrupt extends Thread{

    @Override
    public void run()
    {
        try
        {
            sleep(10000);  // 延迟50秒
            System.out.println("do something");
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception
    {
        Thread thread = new Demo6ThreadInterrupt();
        thread.start();
        System.out.println("在10秒之内按任意键中断线程!");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出!");
    }
}
