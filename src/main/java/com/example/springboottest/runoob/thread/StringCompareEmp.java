package com.example.springboottest.runoob.thread;

import java.nio.charset.StandardCharsets;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName StringCompareEmp.java
 * @Description
 * @createTime 2021年11月18日 15:12:00
 */
public class StringCompareEmp {
    public static void main(String args[]) {
        String str = "Hello World";
        String anotherString = "Hello Wor";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));  //忽略大小写
        System.out.println(str.compareTo(objStr.toString()));


        String a = "qwer";
        String reverse = new StringBuffer(a).reverse().toString();
        System.out.println(reverse);


        String reverse1 = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse1 += a.charAt(i);
        }
        System.out.println(reverse1);

        String reverse2 = "";
        for (int i = 0; i < a.length(); i++) {
            reverse2 = a.charAt(i) + reverse2;
        }
        System.out.println(reverse2);


        String reverse3 = "";
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            reverse3 = aChar + reverse3;
        }
        System.out.println(reverse3);

        byte[] bytes = a.getBytes(StandardCharsets.UTF_8);
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }


    }
}
