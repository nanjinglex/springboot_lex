package com.example.springboottest.designpattern.adapterpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Mp4Player.java
 * @Description TODO
 * @createTime 2021年08月17日 15:11:00
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
