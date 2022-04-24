package com.example.springboottest.runoob.array;

import java.util.Arrays;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2Maopao.java
 * @Description TODO
 * @createTime 2021年11月23日 17:32:00
 */
public class Demo2Maopao {
    public static void main(String[] args) {
        //冒泡排序算法
        int[] numbers = new int[]{1, 5, 8, 2, 3, 9, 4};
        //需进行length-1次冒泡
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");


        maopao(new int[]{9, 7, 8, 3, 2, 6, 1});
        System.out.println("=================================");
        zhishu(100);

        zhishu2(100);
    }


    private static void maopao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);


    }

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

    private static void zhishu2(int n){
        for(int i=2;i<=n;i++) {
            for(int j=2;j<=i;j++) {
                if(i%j==0 && i!=j) {
                    break;
                }
                if(j==i) {
                    System.out.println("质数：i= "+i);
                }
            }
        }
    }


}
