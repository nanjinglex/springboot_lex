package com.example.springboottest.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName UserFactoryBean.java
 * @Description TODO
 * @createTime 2021年07月31日 11:08:00
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
