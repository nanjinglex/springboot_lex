package com.example.springboottest.runoob.array;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5Digui.java
 * @Description
 * @createTime 2022年02月08日 14:53:00
 */
public class Demo5Digui {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(cheng(3));

    }

    /*
    递归：1~n求和
     */
    private static int sum(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    private static int cheng(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * cheng(n - 1);
        }
    }





}
