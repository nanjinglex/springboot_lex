package com.example.springboottest.runoob.designpattern.templatepattern;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName TemplatePatternDemo.java
 * @Description TODO
 * @createTime 2021年08月17日 19:09:00
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
