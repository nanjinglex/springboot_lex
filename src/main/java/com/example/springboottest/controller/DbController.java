package com.example.springboottest.controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.example.springboottest.pojo.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mydb")
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from sys_user";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
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

//    @RequestMapping("/user/{id}")
//    public Map<String,Object> getUser(@PathVariable String id){
//        Map<String,Object> map = null;
//
//        List<Map<String, Object>> list = getDbType();
//
//        for (Map<String, Object> dbmap : list) {
//
//            Set<String> set = dbmap.keySet();
//
//            for (String key : set) {
//                if(key.equals("id")){
//                    if(dbmap.get(key).equals(id)){
//                        map = dbmap;
//                    }
//                }
//            }
//        }
//
//        if(map==null)
//            map = list.get(0);
//        return map;
//    }

}

