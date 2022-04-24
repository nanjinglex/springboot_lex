package com.example.springboottest.runoob.designpattern.templatepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Cricket.java
 * @Description TODO
 * @createTime 2021年08月17日 19:08:00
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
