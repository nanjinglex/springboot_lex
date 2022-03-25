package com.example.springboottest.util.rdbms;

import org.apache.commons.collections.CollectionUtils;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ListStreamTest.java
 * @Description
 * @createTime 2022年03月23日 10:43:00
 */
public class ListStreamTest {

    /**
     * 系统 schema
     */
    public static final List<String> SYS_SCHEMA = Arrays.asList("information_schema", "pg_catalog");

    public static void main(String[] args) {
        List<String> schemaList = Arrays.asList("information_schema", "pg_catalog","public","test","include","exclude");
        List<String> includesnames = Arrays.asList("include");
//        List<String> includesnames = new ArrayList<>();
        List<String> excludesnames = Arrays.asList("exclude");

        List<String> collectList =
                schemaList.stream()
                .filter(o -> !SYS_SCHEMA.contains(o))//排除系统schema
                .filter(o -> {
                    if (CollectionUtils.isNotEmpty(
                            includesnames)) {
                        return includesnames.contains(o);
                    }
                    return true;
                })
                .filter(o -> {
                    if (CollectionUtils.isNotEmpty(
                            excludesnames)) {
                        return !excludesnames.contains(o);
                    }
                    return true;
                }).collect(Collectors.toList());
        System.out.println(collectList);

    }

}
