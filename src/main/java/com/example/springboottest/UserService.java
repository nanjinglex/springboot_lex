package com.example.springboottest;

import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2021年06月23日 12:12:00
 */
public interface UserService {
    List selectAll();
    List selectByCondition();
}
