package com.example.springboottest.runoob.designpattern.prototypepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Square.java
 * @Description TODO
 * @createTime 2021年08月17日 14:08:00
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
