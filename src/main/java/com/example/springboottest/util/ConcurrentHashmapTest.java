package com.example.springboottest.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ConcurrentHashmapTest.java
 * @Description TODO
 * @createTime 2022年01月10日 10:26:00
 */
public class ConcurrentHashmapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("a", "aa");
        map.put("a","aaa");
        map.put("b", "bb");
        map.putIfAbsent("b","bbb");
        map.put("c", "cc");
//        map.remove("b");
        map.entrySet().forEach(o -> System.out.println(o.getKey() + ":" + o.getValue()));
    }


}
