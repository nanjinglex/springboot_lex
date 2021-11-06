package com.example.springboottest.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Job.java
 * @Description TODO
 * @createTime 2021年06月10日 15:23:00
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user")
public class UserMybatisPlus {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String jobName;

    @TableField("age")
    private String age;

    @TableField("email")
    private String email;

}
