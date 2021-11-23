package com.example.springboottest.runoob.collection;

import org.aspectj.weaver.ast.Var;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3ToArray.java
 * @Description TODO
 * @createTime 2021年11月20日 16:25:00
 */
public class Demo3ToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
//        Object[] objects = list.toArray();
        String[] s1 = list.toArray(new String[0]);
        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.println(contents);
        }

        //1.创建数组
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = i+"";
        }
        for (String string : strings) {
            System.out.println(string);
        }

        //2.创建数组
        String[] s = new String[] {"q","w","e"};
        for (String s2 : s) {
            System.out.println(s2);
        }
    }
}
