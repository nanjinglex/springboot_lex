package com.example.springboottest.runoob.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo4HashTable.java
 * @Description TODO
 * @createTime 2021年11月20日 16:47:00
 */
public class Demo4HashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
