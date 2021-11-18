package com.example.springboottest.runoob.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName OctalObserver.java
 * @Description TODO
 * @createTime 2021年08月17日 17:52:00
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
