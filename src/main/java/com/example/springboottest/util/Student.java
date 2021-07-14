package com.example.springboottest.util;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年07月13日 15:12:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int age;
    private String name;
    private String adress;


    public static void main(String[] args) {

        List<Student> list = Lists.newArrayList();
        list.add(new Student(19, "张三", "beijing"));
        list.add(new Student(18, "张三", "beijing"));
        list.add(new Student(17, "张三", "beijing"));
        list.add(new Student(21, "张三", "beijing"));

//按年龄排序(Integer类型)
        List<Student> studentsSortName = list.stream()
                .filter(o -> o.getAge() > 17)
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());


        studentsSortName.stream().forEach(o -> System.out.println(o));
        studentsSortName.stream().forEach(System.out::println);
        System.out.println(studentsSortName.stream().mapToInt(Student::getAge).max());
        Long collect = studentsSortName.stream().map(Student::getName).collect(Collectors.counting());
        System.out.println(collect);
//        list.stream().forEach(o-> System.out.println(o));


        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.remove("b");
        map.entrySet().forEach(o -> System.out.println(o.getKey() + ":" + o.getValue()));


    }
}
