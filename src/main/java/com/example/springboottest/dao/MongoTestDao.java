package com.example.springboottest.dao;

import com.example.springboottest.pojo.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoTestDao {


    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     */
    public void saveTest(MongoTest test) {
        mongoTemplate.save(test);
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public List<MongoTest> findTestByAge(Integer age, Integer currentPage, Integer limit) {
        Query query=new Query(Criteria.where("age").is(age));
        query.skip(currentPage*limit).limit(limit);
        List<MongoTest> mgt =  mongoTemplate.find(query , MongoTest.class);
        return mgt;
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public int selectCount(Integer age) {
        Query query=new Query(Criteria.where("age").is(age));
//        query.skip(currentPage*limit).limit(limit);
        int count =  (int)mongoTemplate.count(query , MongoTest.class);
        return count;
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public void findAll() {
        List<MongoTest> all = mongoTemplate.findAll(MongoTest.class);
        for (MongoTest mongoTest : all) {
            System.out.println(mongoTest);
        }
    }

    /**
     * 更新对象
     */
    public void updateTest(MongoTest test) {
        Query query=new Query(Criteria.where("id").is(test.getId()));
        Update update= new Update().set("age", test.getAge()).set("name", test.getName());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,MongoTest.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,TestEntity.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteTestById(Integer id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,MongoTest.class);
    }
}