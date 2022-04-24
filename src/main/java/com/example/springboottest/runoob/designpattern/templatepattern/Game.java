package com.example.springboottest.runoob.designpattern.templatepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Game.java
 * @Description TODO
 * @createTime 2021年08月17日 19:08:00
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}