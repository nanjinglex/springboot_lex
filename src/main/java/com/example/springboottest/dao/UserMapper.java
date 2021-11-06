package com.example.springboottest.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.pojo.UserMybatisPlus;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserMybatisPlus> {

}
