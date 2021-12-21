package com.example.springboottest.service;

import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description
 * @createTime 2021年06月23日 12:12:00
 */
public interface UserService {
    List selectAll();
    List selectByCondition();

    List getBySpel(String key);
}
