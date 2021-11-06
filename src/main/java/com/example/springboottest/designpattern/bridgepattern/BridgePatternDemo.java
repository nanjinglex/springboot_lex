package com.example.springboottest.designpattern.bridgepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName BridgePatternDemo.java
 * @Description TODO
 * @createTime 2021年08月17日 15:41:00
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
