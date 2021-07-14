package com.example.springboottest.pojo;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mongoTest")
@Data
public class MongoTest {
    private String id;
    private Integer age;
    private String name;


}
