package com.example.springboottest.designpattern.decoratorpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2021年08月17日 16:40:00
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}