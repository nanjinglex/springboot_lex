package com.example.springboottest.runoob.designpattern.adapterpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName AdvancedMediaPlayer.java
 * @Description TODO
 * @createTime 2021年08月17日 15:10:00
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}