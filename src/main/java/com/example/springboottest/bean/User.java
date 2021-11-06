package com.example.springboottest.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Var;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2021年07月31日 11:09:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String address;


    public static void main(String[] args) {

        System.out.println("java.home : "+System.getProperty("java.home"));
        System.out.println("java.version : "+System.getProperty("java.version"));
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.putIfAbsent("name","fjx");
        objectObjectConcurrentHashMap.put("sex","haha");
        objectObjectConcurrentHashMap.putIfAbsent("name","lex");
        objectObjectConcurrentHashMap.put("sex","男");
        System.out.println(objectObjectConcurrentHashMap);

    }
}
