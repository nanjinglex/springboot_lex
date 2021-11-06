package com.example.springboottest.designpattern.bridgepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RedCircle.java
 * @Description TODO
 * @createTime 2021年08月17日 15:40:00
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}