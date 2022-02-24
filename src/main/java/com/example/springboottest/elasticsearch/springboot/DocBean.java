package com.example.springboottest.elasticsearch.springboot;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName DocBean.java
 * @Description TODO
 * @createTime 2022年02月24日 14:20:00
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "ems", shards = 1, replicas = 0)
public class DocBean {

    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String firstCode;

    @Field(type = FieldType.Keyword)
    private String secordCode;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String content;

    @Field(type = FieldType.Integer)
    private Integer type;

    public DocBean(Long id,String firstCode,String secordCode,String content,Integer type){
        this.id=id;
        this.firstCode=firstCode;
        this.secordCode=secordCode;
        this.content=content;
        this.type=type;
    }
}
