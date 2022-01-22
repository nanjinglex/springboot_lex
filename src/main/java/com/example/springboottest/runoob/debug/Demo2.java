package com.example.springboottest.runoob.debug;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1.java
 * @Description 打印变量日志
 * @createTime 2022年01月18日 09:33:00
 */
public class Demo2 {
    public static void main(String[] args) {



        for (int i = 0; i < 20; i++) {
            try {
                Integer integer =  Integer.parseInt("xxx");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int a =  1/0;
    }
}
