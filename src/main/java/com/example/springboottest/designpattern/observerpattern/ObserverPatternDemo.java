package com.example.springboottest.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ObserverPatternDemo.java
 * @Description TODO
 * @createTime 2021年08月17日 17:53:00
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
