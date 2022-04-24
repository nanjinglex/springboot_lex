package com.example.springboottest.runoob.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName HexaObserver.java
 * @Description TODO
 * @createTime 2021年08月17日 17:53:00
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
