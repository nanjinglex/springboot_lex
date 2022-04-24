package com.example.springboottest.runoob.designpattern.decoratorpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ShapeDecorator.java
 * @Description TODO
 * @createTime 2021年08月17日 16:41:00
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
