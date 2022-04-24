package com.example.springboottest.runoob.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2LinkedList.java
 * @Description TODO
 * @createTime 2021年11月20日 11:36:00
 */
public class Demo2LinkedList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.addFirst("0");
        System.out.println(lList);
        lList.addLast("6");
        System.out.println(lList);




    }
}
