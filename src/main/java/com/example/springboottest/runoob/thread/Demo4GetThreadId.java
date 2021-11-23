package com.example.springboottest.runoob.thread;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo4GetThreadId.java
 * @Description TODO
 * @createTime 2021年11月22日 17:53:00
 */
public class Demo4GetThreadId implements Runnable{
    private ThreadID var;

    public Demo4GetThreadId(ThreadID v) {
        this.var = v;
    }

    public void run() {
        try {
            print("var getThreadID =" + var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID =" + var.getThreadID());
        } catch (InterruptedException x) {
        }
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public static void main(String[] args) {
        ThreadID tid = new ThreadID();
        Demo4GetThreadId shared = new Demo4GetThreadId(tid);

        try {
            Thread threadA = new Thread(shared, "threadA");
            threadA.start();

            Thread.sleep(500);

            Thread threadB = new Thread(shared, "threadB");
            threadB.start();

            Thread.sleep(500);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();
        } catch (InterruptedException x) {
        }
    }
}

class ThreadID extends ThreadLocal {
    private int nextID;

    public ThreadID() {
        nextID = 10001;
    }

    private synchronized Integer getNewID() {
        Integer id = new Integer(nextID);
        nextID++;
        return id;
    }


    protected Object initialValue() {
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID() {
        Integer id = (Integer) get();
        return id.intValue();
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}
