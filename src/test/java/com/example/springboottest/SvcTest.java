package com.example.springboottest;

import com.example.springboottest.service.CalculateService;
import com.example.springboottest.service.Svc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName SvcTest.java
 * @Description TODO
 * @createTime 2021年08月09日 10:21:00
 */

@SpringBootTest
public class SvcTest {

///**
// * @Autowired
// * 装配顺序：
// *
// * 按照type在上下文中查找匹配的bean
// *
// * 查找type为Svc的bean
// * 如果有多个bean，则按照name进行匹配
// *
// * 如果有@Qualifier注解，则按照@Qualifier指定的name进行匹配
// *
// * 查找name为svcA的bean
// * 如果没有，则按照变量名进行匹配
// *
// * 查找name为svc的bean
// * 匹配不到，则报错。（@Autowired(required=false)，如果设置required为false(默认为true)，则注入失败时不会抛出异常）
// */
//    @Autowired//
//    Svc svcC;
//
//    @Autowired
//    @Qualifier("svcB")//需要
//    Svc svc;
//
//
//    /**
//     * 装配顺序：
//     *
//     * 如果同时指定了name和type，则从 Spring 上下文中找到唯一匹配的 bean 进行装配，找不到则抛出异常。
//     *
//     * 如果指定了name，则从上下文中查找名称（id）匹配的 bean 进行装配，找不到则抛出异常。
//     *
//     * 如果指定了type，则从上下文中找到类型匹配的唯一 bean 进行装配，找不到或是找到多个，都会抛出异常。
//     *
//     * 如果既没有指定name，又没有指定type，则默认按照byName方式进行装配；如果没有匹配，按照byType进行装配。
//     */
//    @Resource//默认按照name属性
//    Svc svcA;
//
//    @Resource(name = "svcC", type = Svc.class)
//    Svc s;
//
//    /**
//     * 另:
//     * 首先我们需要知道，Spring 中有这么3种依赖注入的方式：
//     *
//     * 基于 field 注入（属性注入）
//     *
//     * 基于 setter 注入
//     *
//     * 基于 constructor 注入（构造器注入）
//     *
//     */
//
//    @Test
//    void testAutowiredDefault() {
//        Assertions.assertNotNull(svcC);
//        svcC.sayHello();
//    }
//
//    @Test
//    void testAutowired() {
//        Assertions.assertNotNull(svc);
//        svc.sayHello();
//    }
//
//    @Test
//    void testResource() {
//        Assertions.assertNotNull(svcA);
//        svcA.sayHello();
//    }
//
//    @Test
//    void testResourceExact() {
//        Assertions.assertNotNull(s);
//        s.sayHello();
//    }

    @Autowired
    Map<String, Svc> svcMap = new HashMap<>();

    @Test
    void testsvcMapt() {
        for (String s1 : svcMap.keySet()) {
            System.out.println(s1+":"+svcMap.get(s1));
        }

        String type = "A";
        Svc svc = svcMap.get(type);


        svc.sayHello();
    }


}
