package com.example.springboottest.runoob.array;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3Mult.java
 * @Description TODO
 * @createTime 2021年11月24日 14:08:00
 */
public class Demo3Mult {

    public static void main(String[] args) {
        printMult();
    }


    private static void printMult() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
