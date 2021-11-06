package com.example.springboottest.designpattern.proxypattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ProxyImage.java
 * @Description TODO
 * @createTime 2021年08月17日 17:04:00
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
