package com.example.springboottest.controller;

import java.util.UUID;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年06月19日 17:22:00
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());

        //总数：count  每页大小 pageSize：1000  分页数
        int count = 1000052;
        int pageSize = 100000;
        System.out.println(count / pageSize);
//        int totalPageNum = (count % pageSize) == 0 ? count / pageSize : count / pageSize + 1;

        int totalPageNum = (count + pageSize - 1) / pageSize;
        System.out.println(totalPageNum);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < totalPageNum; i++) {
            sb.append(i+"="+i*pageSize+",");
        }
        String shardingParameter = sb.toString().endsWith(",") ? sb.toString().substring(0,sb.length()-1) : sb.toString();

        System.out.println(shardingParameter);






    }

}
