package com.example.springboottest;

import com.example.springboottest.service.Svc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName SvcTest.java
 * @Description TODO
 * @createTime 2021年08月09日 10:21:00
 */

@SpringBootTest
public class SvcTest {

    @Autowired(required=false)
    @Qualifier("svcB")
    Svc svc ;

    @Test
    void rc() {
        Assertions.assertNotNull(svc);
        svc.sayHello();
    }
}
