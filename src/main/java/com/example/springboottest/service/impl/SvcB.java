package com.example.springboottest.service.impl;

import com.example.springboottest.service.Svc;
import org.springframework.stereotype.Service;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName SvcA.java
 * @Description TODO
 * @createTime 2021年08月09日 10:19:00
 */
@Service
public class SvcB implements Svc {
    @Override
    public void sayHello() {
        System.out.println("hello, this is service B");
    }

}
