package com.example.springboottest.designpattern.prototypepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2021年08月17日 14:09:00
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
