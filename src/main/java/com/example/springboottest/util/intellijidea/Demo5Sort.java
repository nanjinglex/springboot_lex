package com.example.springboottest.util.intellijidea;

import lombok.SneakyThrows;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5Sort.java
 * @Description TODO
 * @createTime 2022年01月28日 17:53:00
 */
public class Demo5Sort implements Runnable{
private int instance;
public Demo5Sort(int instance){
    this.instance = instance;
}
    public static void main(String[] args) {
        int[] ints = {5, 7, 2, 8};
        for (int anInt : ints) {
            new Thread(new Demo5Sort(anInt)).start();
        }
    }
    @SneakyThrows
    @Override
    public void run() {
    Thread.sleep(this.instance);
        System.out.println(this.instance);
    }
}
