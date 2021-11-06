package com.example.springboottest.designpattern.bridgepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName GreenCircle.java
 * @Description TODO
 * @createTime 2021年08月17日 15:40:00
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
