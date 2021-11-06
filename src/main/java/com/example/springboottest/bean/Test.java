package com.example.springboottest.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年08月25日 10:13:00
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(i);
            strings.remove(i);
                i--;
            }
        }

}
