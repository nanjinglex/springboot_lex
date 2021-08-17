package com.example.springboottest.designpattern.prototypepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Shape.java
 * @Description TODO
 * @createTime 2021年08月17日 14:05:00
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
