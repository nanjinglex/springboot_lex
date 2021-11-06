package com.example.springboottest.elasticsearch;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ElasticsearchConfig.java
 * @Description TODO
 * @createTime 2021年09月02日 16:56:00
 */
@Configuration
public class ElasticsearchConfig {
    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("127.0.0.1", 9200, "http")

                        /** 多个节点也是在当前地方配置 */
//                        , new HttpHost("localhost", 9300, "http")
                ));
        return client;
    }
}

