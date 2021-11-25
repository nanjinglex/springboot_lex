package com.example.springboottest.runoob.array;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1Reverse.java
 * @Description TODO
 * @createTime 2021年11月23日 16:53:00
 */
public class Demo1Reverse {
    public static void main(String[] args) {
        reverse(new int[]{1, 2, 3, 4, 5});
        swap(1,2);
    }

    /*
    reverse
     */
    private static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        for (int i : result) {
            System.out.println(i);
        }
        return result;
    }

    public static void swap(int a, int b) {
        System.out.println(String.format("before a=%d,b=%d", a, b));
        int temp = a;
        a = b;
        b = temp;
        System.out.println(String.format("after a=%d,b=%d", a, b));
    }
}
