package com.example.springboottest.javastack;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3Observer.java
 * @Description
 * @createTime 2022年02月10日 10:16:00
 */
public class Demo3Observer {
    public static void main(String[] args) {
        // 创建一个观察目标
        JavaStackObservable javaStackObservable = new JavaStackObservable();

        // 添加观察者
        javaStackObservable.addObserver(new ReaderObserver("小明"));
        javaStackObservable.addObserver(new ReaderObserver("小张"));
        javaStackObservable.addObserver(new ReaderObserver("小爱"));

        // 发表文章
        javaStackObservable.publish("什么是观察者模式？");
    }
}

/**
 * 观察目标：栈长
 * 来源微信公众号：Java技术栈
 */
@Getter
class JavaStackObservable extends Observable{
    private String article;
    /**
     * 发表文章
     * @param article
     */
    public void publish(String article){
        // 发表文章
        this.article = article;

        // 改变状态
        this.setChanged();

        // 通知所有观察者
        this.notifyObservers();
    }
}

/**
 * 观察者：读者粉丝
 * 来源微信公众号：Java技术栈
 */
@RequiredArgsConstructor
class ReaderObserver implements Observer{
    @NonNull
    private String name;

    private String article;

    @Override
    public void update(Observable o, Object arg) {
        // 更新文章
        updateArticle(o);
    }

    private void updateArticle(Observable o) {
        JavaStackObservable javaStackObservable = (JavaStackObservable) o;
        this.article = javaStackObservable.getArticle();
        System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, this.article);
    }
}
