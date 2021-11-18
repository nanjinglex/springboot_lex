package com.example.springboottest.runoob.java8;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Java8Test.java
 * @Description TODO
 * @createTime 2021年11月12日 14:59:00
 */
public class Java8Test {
    public static void main(String args[]){

        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");

        Java8Test tester = new Java8Test();
        System.out.println("使用 Java 7 语法: ");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("使用 Java 8 语法: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);

        names2.forEach(System.out::println);

        new ArrayList<>().forEach(System.out::println);
        new ArrayList<>().forEach(e-> System.out.println(e));

        String encodeToString = Base64.getEncoder().encodeToString("123456".getBytes(StandardCharsets.UTF_8));
        System.out.println(encodeToString);

        byte[] decode = Base64.getDecoder().decode(encodeToString);
        System.out.println("原始密码："+ new String(decode));


        int x=4;
        System.out.println(x++);//先输出 再+
        System.out.println(x);

        int r = (int) 6.7;
        System.out.println(r);

        int a1 = 5;
        double a2 = (float) a1;

    }

    // 使用 java 7 排序
    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序
    private void sortUsingJava8(List<String> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
