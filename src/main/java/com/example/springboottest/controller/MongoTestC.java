package com.example.springboottest.controller;
import com.example.springboottest.dao.MongoTestDao;
import com.example.springboottest.pojo.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MongoTestC {

    @Autowired
    private MongoTestDao mtdao;

    @GetMapping(value="/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest=new MongoTest();
        mgtest.setId("11");
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @GetMapping(value="/test2")
    public List<MongoTest> findTestByName(){
        List<MongoTest> mgtest= mtdao.findTestByAge(44,0,10);
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @GetMapping(value="/test3")
    public void updateTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId("11");
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value="/test4")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }
}
