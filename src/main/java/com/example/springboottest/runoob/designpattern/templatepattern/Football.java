package com.example.springboottest.runoob.designpattern.templatepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Football.java
 * @Description TODO
 * @createTime 2021年08月17日 19:09:00
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
