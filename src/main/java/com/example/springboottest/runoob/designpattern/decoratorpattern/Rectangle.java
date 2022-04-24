package com.example.springboottest.runoob.designpattern.decoratorpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Rectangle.java
 * @Description TODO
 * @createTime 2021年08月17日 16:40:00
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
