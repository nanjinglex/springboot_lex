package com.example.springboottest.controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

import com.example.springboottest.pojo.Foo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "DbController模块")
@RestController
//@RequestMapping("/mydb")
public class DbController {

    // 缓存
    Map<String, Object> cache = new HashMap<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "getUsers")
    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){

        List<Map<String, Object>> users = (List<Map<String, Object>>) cache.get("users");
        if (StringUtils.isEmpty(users)) {
            // 未命名缓存，查询数据库
            String sql = "select * from sys_user";
            users =  jdbcTemplate.queryForList(sql);
            // 将查询得到的数据存入缓存
            cache.put("users",users);
        }
        for (Map<String, Object> map : users) {
            map.keySet().forEach(key-> System.out.println(key+":"+map.get(key)));
//            Set<Entry<String, Object>> entries = map.entrySet();
//            if(entries != null) {
//                Iterator<Entry<String, Object>> iterator = entries.iterator( );
//                while(iterator.hasNext( )) {
//                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
//                    Object key = entry.getKey( );
//                    Object value = entry.getValue();
//                    System.out.println(key+":"+value);
//                }
//            }
        }
        return users;
    }
    @RequestMapping("/getFoos")
    public List<Foo> getFoos(){
        // 查询数据的SQL语句
        String sql = "SELECT * FROM foo;";
//        List<Foo> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Foo.class));
//
//        for (Foo product : list) {
//            System.out.println(product);
//        }
//        return list;

        List<Foo> query = jdbcTemplate.query(sql, new RowMapper<Foo>() {
            @Override
            public Foo mapRow(ResultSet arg0, int arg1) throws SQLException {
//                System.out.println(arg0);
                return new Foo(arg0.getInt("id"),arg0.getString("location"),Foo.Status.TODO);
            }
        });

//        for (Foo product : query) {
//            System.out.println(product);
//        }
        return query;







    }



}

