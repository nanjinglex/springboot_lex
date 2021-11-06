package com.example.springboottest.service.impl;

import com.example.springboottest.dao.UserMapper;
import com.example.springboottest.service.MybatisPlusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

//    @Autowired
//    private MybatisPlusServiceImpl mybatisPlusServiceImpl;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(String id) throws Exception {
        try {
            userMapper.deleteById(id);
            int a = 8/0;
            userMapper.deleteById(Integer.valueOf(id)-1);
        }catch (Exception e){
            throw new Exception("删除错误");
//            e.printStackTrace();
        }

//        this.deleteById(id,"");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteById(String id,String qq) {
        userMapper.deleteById(id);
        int a = 8/0;
        userMapper.deleteById(Integer.valueOf(id)-1);
    }
}
