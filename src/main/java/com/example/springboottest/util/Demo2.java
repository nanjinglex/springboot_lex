package com.example.springboottest.util;

import lombok.Data;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2.java
 * @Description TODO
 * @createTime 2021年07月02日 17:54:00
 */
@Data
public class Demo2 {
    int id;
    String name;

    public static void main(String[] args) {
        new Thread(()->System.out.println("nihao")).start();
    System.out.println(Runtime.getRuntime().availableProcessors());

try {
    int a =8/0;
}catch (Exception e){
    System.err.println("exception:"+e.getMessage());
}

        System.out.println("over");

    }
}
