package com.example.springboottest.runoob.designpattern.decoratorpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RedShapeDecorator.java
 * @Description TODO
 * @createTime 2021年08月17日 16:41:00
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
