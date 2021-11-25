package com.example.springboottest.runoob.array;

import java.util.Arrays;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo4zhishu.java
 * @Description
 * @createTime 2021年11月25日 10:38:00
 */
public class Demo4zhishu {

    public static void main(String[] args) {

        zhishu(100);

        zhishu2(100);


    }

    //1
    private static void zhishu(int n) {
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    //2
    private static void zhishu2(int n) {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (j == i) {
                    System.out.println("质数：i= " + i);
                }
            }
        }
    }

    private static void zhishu3(int n) {
        for (int i = 2; i <= n; i++) {
            int j = 2;
            for (; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i / 2 + 1) {
                System.out.println("质数：i= " + i);
            }
        }
    }


}

