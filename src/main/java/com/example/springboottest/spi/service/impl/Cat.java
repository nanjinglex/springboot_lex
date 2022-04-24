package com.example.springboottest.spi.service.impl;

import com.example.springboottest.spi.service.Animal;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Dog.java
 * @Description TODO
 * @createTime 2022年01月17日 16:49:00
 */
public class Cat implements Animal {
    @Override
    public void bark() {
        System.out.println("miaomiao");
    }
}
