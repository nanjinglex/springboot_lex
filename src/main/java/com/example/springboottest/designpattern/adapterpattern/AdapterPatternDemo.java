package com.example.springboottest.designpattern.adapterpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName AdapterPatternDemo.java
 * @Description TODO
 * @createTime 2021年08月17日 15:13:00
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
