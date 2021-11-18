package com.example.springboottest.runoob.designpattern.prototypepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Rectangle.java
 * @Description TODO
 * @createTime 2021年08月17日 14:08:00
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
