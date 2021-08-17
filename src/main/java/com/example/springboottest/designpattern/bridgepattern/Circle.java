package com.example.springboottest.designpattern.bridgepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2021年08月17日 15:41:00
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
