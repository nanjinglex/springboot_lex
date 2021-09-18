package com.example.springboottest;

import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ElasticSearchTest.java
 * @Description TODO
 * @createTime 2021年09月02日 18:00:00
 */
@SpringBootTest
public class ElasticSearchTest {

    @Autowired
    @Qualifier("restHighLevelClient")
    private RestHighLevelClient client;

    /**
     * 功能描述：createIndex 测试索引的创建 <br>
     *
     * @param
     * @return void
     * @Author xununan
     * @Date 2020-08-23 18:53
     * @Version 1.0.0
     */
    @Test
    void createIndexTest() throws IOException {
        // 1. 创建索引请求
        CreateIndexRequest firstIndex = new CreateIndexRequest("xununan_index");

        // 2. 客户端执行创建索引的请求
        CreateIndexResponse response = client.indices().create(firstIndex, RequestOptions.DEFAULT);

        System.out.println(response);
    }


    /**
     * 功能描述：existsIndexTest 判断索引是否存在 <br>
     *
     * @param
     * @return void
     * @Author xununan
     * @Date 2020-08-23 18:59
     * @Version 1.0.0
     */
    @Test
    void existsIndexTest() throws IOException {
        // 1. 创建一个get请求获取指定索引的信息
        GetIndexRequest getIndexRequest = new GetIndexRequest("lex1");

        // 2. 客户端执行请求判断索引是否存在
        boolean exists = client.indices().exists(getIndexRequest, RequestOptions.DEFAULT);
        System.out.println(exists);
        if (!exists) {
            System.out.println(">>>>>>>>> 索引不存在。。。。。");
            return;
        }
    }

    /**
     * 删除索引
     * @throws IOException
     */
    @Test
    void deleteIndexTest() throws IOException {
        DeleteIndexRequest request = new DeleteIndexRequest("lex");
        AcknowledgedResponse response = client.indices().delete(request,RequestOptions.DEFAULT);
        boolean acknowledged = response.isAcknowledged();
        System.out.println(acknowledged);

    }


}
