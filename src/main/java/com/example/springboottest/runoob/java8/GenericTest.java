package com.example.springboottest.runoob.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName GenericTest.java
 * @Description TODO
 * @createTime 2021年11月16日 17:56:00
 */
public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        //getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
