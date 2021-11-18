package com.example.springboottest.runoob.designpattern.proxypattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RealImage.java
 * @Description TODO
 * @createTime 2021年08月17日 17:03:00
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
