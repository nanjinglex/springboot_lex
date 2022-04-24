package com.example.springboottest.elasticsearch.springboot;

import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName IElasticService.java
 * @Description TODO
 * @createTime 2022年02月24日 14:22:00
 */
public interface IElasticService {

    void createIndex();

    void deleteIndex(String index);

    void save(DocBean docBean);

    void saveAll(List<DocBean> list);

    Iterator<DocBean> findAll();

    Page<DocBean> findByContent(String content);

    Page<DocBean> findByFirstCode(String firstCode);

    Page<DocBean> findBySecordCode(String secordCode);

    Page<DocBean> query(String key);
}
