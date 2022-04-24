package com.example.springboottest.springboot2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ThreadLocalTest.java
 * @Description TODO
 * @createTime 2021年12月14日 15:49:00
 */
public class ThreadLocalTest {
    static ThreadLocal<Long> currentTime = new ThreadLocal<>();
    static ThreadLocal<Map> localMap = new ThreadLocal<>();

    public static void main(String[] args) {

        currentTime.set(12L);
        System.out.println(currentTime.get());
        currentTime.set(14L);
        System.out.println(currentTime.get());
        currentTime.remove();
        System.out.println(currentTime.get());

        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","lex");
        map.put("age",18);
        localMap.set(map);
        System.out.println(localMap.get());

        HashMap<Object, Object> map1 = new HashMap<>();
        map1.put("name","fingxuan");
        map1.put("age",20);
        localMap.set(map1);
        System.out.println(localMap.get());

        localMap.remove();
        System.out.println(localMap.get());


    }
}
