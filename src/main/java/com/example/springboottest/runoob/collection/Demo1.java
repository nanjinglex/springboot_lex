package com.example.springboottest.runoob.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1.java
 * @Description TODO
 * @createTime 2021年11月20日 15:22:00
 */

public class Demo1 {
    public static void main(String[] args) {
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set = new TreeSet<String>();
        for (int i = 0; i < coins.length; i++) {
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}

