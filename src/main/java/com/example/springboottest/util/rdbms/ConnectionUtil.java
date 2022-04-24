package com.example.springboottest.util.rdbms;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Connection.java
 * @Description
 * @createTime 2022年03月12日 11:14:00
 */
public class ConnectionUtil {

    public static java.sql.Connection getConnection(String driver,String url,String userName,String passWord) {
        try {
            Class.forName(driver);
            java.sql.Connection connection = DriverManager.getConnection(url,
                    userName,
                    passWord);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static java.sql.Connection getConnection(String driver, String url, Properties info) {
        try {
            Class.forName(driver);
            java.sql.Connection connection = DriverManager.getConnection(url,
                    info);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
