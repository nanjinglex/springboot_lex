package com.example.springboottest.designpattern.adapterpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName VlcPlayer.java
 * @Description TODO
 * @createTime 2021年08月17日 15:11:00
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
