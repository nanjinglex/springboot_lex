package com.example.springboottest.runoob.string;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ReverseDemo.java
 * @Description TODO
 * @createTime 2021年11月18日 15:49:00
 */
public class ReverseDemo {
    public static void main(String[] args) {

        //1
        String a = "qwer";
        String reverse = new StringBuffer(a).reverse().toString();
        System.out.println(reverse);

//2
        String reverse1 = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse1 += a.charAt(i);
        }
        System.out.println(reverse1);

        //3
        String reverse2 = "";
        for (int i = 0; i < a.length(); i++) {
            reverse2 = a.charAt(i) + reverse2;
        }
        System.out.println(reverse2);

//4
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


        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.
                regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.
                regionMatches(true, 11, second_str, 12, 9); //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);



        long startTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串"
                + " : "+ (endTime - startTime)
                + " 毫秒" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串"
                + " : " + (endTime1 - startTime1)
                + " 毫秒");


        System.out.println(String.format("qqqqq%swww%s",2,3));



        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        System.out.println("objArray 是否包含字符串common2? ： "
                +objArray.contains("common2"));//true
        System.out.println("objArray2 是否包含数组 objArray? ："
                +objArray2.contains(objArray) );//false

        System.out.println("objArray2 是否包含数组 objArray? ："
                +objArray2.containsAll(objArray) );//true



        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组 ary 是否与数组 ary1相等? ："
                +Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ："
                +Arrays.equals(ary, ary2));



    }
    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();

        for (String str : arr1) {
            set.add(str);
        }

        for (String str : arr2) {
            set.add(str);
        }

        String[] result = {  };

        return set.toArray(result);
    }

}
