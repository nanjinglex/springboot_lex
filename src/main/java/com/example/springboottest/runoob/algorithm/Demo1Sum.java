package com.example.springboottest.runoob.algorithm;

/**
 * 求和 0~100
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1Sum.java
 * @Description
 * @createTime 2021年11月20日 11:26:00
 */
public class Demo1Sum {
    public static void main(String[] args) {
        //1
        int limit =100;
        int sum =0;
        int i =0;
        do{
            sum+=i;
            i++;
        }
        while (i<=limit);
        System.out.println(String.format("sum:%d",sum));


        //2
        int sum1 =0;
        for (int i1 = 0; i1 <= 100; i1++) {
            sum1+=i1;
        }
        System.out.println(String.format("sum1:%d",sum1));
    }
}
