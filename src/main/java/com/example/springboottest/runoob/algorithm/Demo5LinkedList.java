package com.example.springboottest.runoob.algorithm;

import java.util.LinkedList;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5LinkedList.java
 * @Description TODO
 * @createTime 2021年11月20日 14:50:00
 */
public class Demo5LinkedList {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("2");
        System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置："+ lList.lastIndexOf("2"));
    }
}
