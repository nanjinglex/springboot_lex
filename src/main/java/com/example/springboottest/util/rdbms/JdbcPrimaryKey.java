package com.example.springboottest.util.rdbms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName PrimaryKey.java
 * @Description
 * @createTime 2022年03月23日 14:09:00
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class JdbcPrimaryKey {
    private String columnName;
    private short keySeq;
    private String pkName;
}
