package com.example.springboottest.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Observer.java
 * @Description TODO
 * @createTime 2021年08月17日 17:52:00
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
