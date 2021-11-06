package com.example.springboottest.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ExecutorsTest.java
 * @Description TODO
 * @createTime 2021年08月04日 16:17:00
 */
@Slf4j
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        log.info("******", Thread.currentThread().getId() + "  thread name: " + Thread.currentThread().getName() + "--" + index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
