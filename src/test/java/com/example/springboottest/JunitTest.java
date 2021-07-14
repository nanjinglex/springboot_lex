package com.example.springboottest;


//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;

import com.example.springboottest.pojo.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JunitTest {




    @Test
    public void say() {
        System.out.println("22212");
    }


    @Test
    void testMysqlConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://192.168.24.140:3306/elastic_job_demo?useSSL=false&serverTimezone=UTC",
                    "root", "123456");
            System.out.println("连接成功");
        } catch (final SQLException ex) {
            System.out.println("连接失败");
            throw new RuntimeException(ex);
        } catch (final ClassNotFoundException ex) {
            System.out.println("连接失败");
            throw new RuntimeException(ex);
        }
    }
//   @Test
//    void testMongoConnect(){
//       try{
//           // 连接到 mongodb 服务
//           MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//           // 连接到数据库
//           MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
//           System.out.println("Connect to database successfully");
//
//       }catch(Exception e){
//           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//       }
//    }

}
