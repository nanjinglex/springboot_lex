package com.example.springboottest.runoob.string;

/**
 * 我们知道输出格式化数字可以使用 printf() 和 format() 方法。
 * <p>
 * String 类使用静态方法 format() 返回一个String 对象而不是 PrintStream 对象。
 * <p>
 * String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。
 *
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1PrintfFormat.java
 * @Description TODO
 * @createTime 2021年11月23日 16:34:00
 */
public class Demo1PrintfFormat {
    public static void main(String[] args) {

        float floatVar = 4.5f;
        int intVar = 4;
        String stringVar = "qwer";

        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);
        System.out.println();
        System.out.println("=========================================");


        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, stringVar);
        System.out.println(fs);


        String str = "qwer";

        System.out.println(str.contains("we"));
        System.out.println(str.contentEquals("qwer"));
        System.out.println(str.contentEquals(new StringBuffer("1234")));


    }
}
