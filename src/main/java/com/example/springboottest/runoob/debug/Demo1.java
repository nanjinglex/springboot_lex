package com.example.springboottest.runoob.debug;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1.java
 * @Description 打印变量日志
 * @createTime 2022年01月18日 09:33:00
 */
public class Demo1 {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }



    private static boolean isInterested(int i) {
        return i % 2 == 0;//调式Evaluate and log    Shift + 鼠标左键  或者Ctrl+Shift+F8
    }
}
