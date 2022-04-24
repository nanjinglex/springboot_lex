package com.example.springboottest.runoob.string;

import java.lang.reflect.Field;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1Change.java
 * @Description TODO
 * @createTime 2022年02月07日 17:34:00
 */
public class Demo1Change {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello Python";
        System.out.println(str); // Hello Python

        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);

        char[] value = (char[])field.get(str);
        value[6] = 'J';
        value[7] = 'a';
        value[8] = 'v';
        value[9] = 'a';
        value[10] = '!';
        value[11] = '!';
        System.out.println(str); // Hello Java!!
    }
}
