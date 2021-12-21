package com.example.springboottest.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2021年06月23日 11:59:00
 */


@Service
//@DS("slave")
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
//    @DS("master")

    public List selectAll() {
        return jdbcTemplate.queryForList("select * from user_test");
    }

    @Override
    @DS("slave_1")
    public List selectByCondition() {
        return jdbcTemplate.queryForList("select * from user ");
    }


    @Override
    @DS("#key")
    public List getBySpel(String key) {
        return jdbcTemplate.queryForList("select * from user ");
    }
}

