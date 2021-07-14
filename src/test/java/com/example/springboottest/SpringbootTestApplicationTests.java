package com.example.springboottest;

import com.example.springboottest.dao.MongoTestDao;
import com.example.springboottest.pojo.MongoTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Resource
    private UserService userService;

    @Autowired
    private com.example.springboottest.dao.MongoTestDao mongoTestDao;


    @Test
    public void selectAll111(){
        mongoTestDao.findAll();
    }

    @Test
    public void selectPage(){
        int i = mongoTestDao.selectCount(44);
        System.out.println(String.format("总记录数：%d",i));
       List<MongoTest> mgtest= mongoTestDao.findTestByAge(44,0,10);
        System.out.println(mgtest.size());
        mgtest.forEach(mongoTest -> System.out.println(mongoTest));


    }

    @Test
    public void selectAll() {
        System.out.println(userService.selectAll());
        System.out.println(userService.selectByCondition());
    }



    @Test
    void contextLoads() {
    }



}
