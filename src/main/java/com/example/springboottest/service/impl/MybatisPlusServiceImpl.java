package com.example.springboottest.service.impl;

import com.example.springboottest.dao.UserMapper;
import com.example.springboottest.service.MybatisPlusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName MybatisPlusServiceImpl.java
 * @Description TODO
 * @createTime 2021年08月20日 16:31:00
 */
@Service
@Slf4j
public class MybatisPlusServiceImpl implements MybatisPlusService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public void deleteById(String id) {
        userMapper.deleteById(id);
        int a = 8/0;
        userMapper.deleteById(Integer.valueOf(id)-1);
    }
}
