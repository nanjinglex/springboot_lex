package com.example.springboottest.runoob.array;/**
 * @ClassName ArrayTest.java
 * @author lex
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年11月18日 20:06:00
 */
public class ArrayTest {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("输出整型数组:");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组:");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组:");
        printArray(characterArray);
    }

    private static <E> void printArray(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
