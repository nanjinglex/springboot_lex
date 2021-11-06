package com.example.springboottest.designpattern.prototypepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName PrototypePatternDemo.java
 * @Description TODO
 * @createTime 2021年08月17日 14:09:00
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
