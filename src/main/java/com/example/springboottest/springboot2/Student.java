package com.example.springboottest.springboot2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Student.java
 * @Description
 * @createTime 2021年12月21日 11:37:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式编程，set属性返回对象
public class Student {
    private String name;
}
