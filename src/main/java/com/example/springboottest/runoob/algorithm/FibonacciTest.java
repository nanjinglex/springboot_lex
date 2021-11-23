package com.example.springboottest.runoob.algorithm;

/**
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
 *
 * 特别指出：第0项是0，第1项是第一个1。
 *
 * 这个数列从第三项开始，每一项都等于前两项之和。
 *
 * @author lex
 * @version 1.0.0
 * @ClassName FibonacciTest.java
 * @Description
 * @createTime 2021年11月18日 20:37:00
 */
public class FibonacciTest {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.printf("Fibonacci of %d is: %d\n", i, fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
