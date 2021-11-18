package com.example.springboottest.runoob.designpattern.observerpattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Subject.java
 * @Description TODO
 * @createTime 2021年08月17日 17:51:00
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
