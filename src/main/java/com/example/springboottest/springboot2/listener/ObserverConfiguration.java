package com.example.springboottest.springboot2.listener;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ObserverConfiguration.java
 * @Description
 * @createTime 2022年02月10日 10:36:00
 */
@Slf4j
@Configuration
public class ObserverConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return (args) -> {
            log.info("发布事件：什么是观察者模式？");
            context.publishEvent(new JavaStackEvent("什么是观察者模式？"));
        };
    }

    @Bean
    public ReaderListener readerListener1(){
        return new ReaderListener("小明");
    }

    @Bean
    public ReaderListener readerListener2(){
        return new ReaderListener("小张");
    }

    @Bean
    public ReaderListener readerListener3(){
        return new ReaderListener("小爱");
    }

}


/**
 * 观察目标：栈长
 * 来源微信公众号：Java技术栈
 */
@Getter
class JavaStackEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public JavaStackEvent(Object source) {
        super(source);
    }


}

/**
 * 观察者：读者粉丝
 * 来源微信公众号：Java技术栈
 */
@RequiredArgsConstructor
class ReaderListener implements ApplicationListener<JavaStackEvent> {

    @NonNull
    private String name;

    private String article;

    @Async
    @Override
    public void onApplicationEvent(JavaStackEvent event) {
        // 更新文章
        updateArticle(event);
    }

    private void updateArticle(JavaStackEvent event) {
        this.article = (String) event.getSource();
        System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, this.article);
    }

}

