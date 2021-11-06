package com.example.springboottest.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName BinaryObserver.java
 * @Description TODO
 * @createTime 2021年08月17日 17:52:00
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
