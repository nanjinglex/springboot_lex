package com.example.springboottest.springboot2.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ApplicationStopListener.java
 * @Description
 * @createTime 2022年02月12日 09:52:00
 */
@Component
@Slf4j
public class ApplicationStopListener implements ApplicationListener<ContextClosedEvent> {
//
//    @Autowired
//    private IpStatusService ipStatusService;

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        try {
            log.info("## sart the ApplicationStopListener start 。。。。。");


//            ipStatusService.cancelIp();

            log.info("## stop the ApplicationStopListener  end 。。。。。");

        } catch (Throwable e) {
            log.info("##something goes wrong when stopping ApplicationStopListener:", e);

        } finally {
            log.info("## ApplicationStopListener client is down.");
        }
    }
}
