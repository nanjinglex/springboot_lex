package com.example.springboottest.util;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ConcurrentMapUtil.java
 * @Description TODO
 * @createTime 2021年07月14日 14:37:00
 */
public class ConcurrentMapUtil {
    public static ConcurrentHashMap<String,String>  map = new ConcurrentHashMap<>();

    public static void setCache(String key,String value){
        ConcurrentMapUtil.map.put(key,value);
    }

    public static String getCache(String key){
        return ConcurrentMapUtil.map.get(key);
    }

    public static void removeCache(String key){
        ConcurrentMapUtil.map.remove(key);
    }

    public static void main(String[] args) {
        ConcurrentMapUtil.setCache("a","aa");
        ConcurrentMapUtil.setCache("a","ab");
        ConcurrentMapUtil.setCache("a","ac");
        ConcurrentMapUtil.setCache("b","bb");
        ConcurrentMapUtil.setCache("c","cc");
        System.out.println(ConcurrentMapUtil.getCache("b"));
        ConcurrentMapUtil.removeCache("b");

        ConcurrentMapUtil.map.entrySet().forEach(o-> System.out.println(o.getKey()+":"+o.getValue()));
    }

}
