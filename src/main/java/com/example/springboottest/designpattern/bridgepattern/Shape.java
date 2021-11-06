package com.example.springboottest.designpattern.bridgepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Shape.java
 * @Description TODO
 * @createTime 2021年08月17日 15:41:00
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}