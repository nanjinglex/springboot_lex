package com.example.springboottest.controller;

import com.example.springboottest.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName DynamicDataSourceController.java
 * @Description
 * @createTime 2021年12月21日 16:11:00
 */
@Api(tags = "DynamicDataSource模块")
@RestController
@RequestMapping("dynamic")
public class DynamicDataSourceController {

    @Autowired
    private UserService userService;

    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "getUsers")
    @GetMapping("/getUsers")
    public List getUsers(){
        List list = userService.selectByCondition();
        return list;
    }

    @ApiOperation(value = "getBySpel")
    @GetMapping("/getBySpel")
    public List getBySpel(){
        String key = "slave_1";
        List list = userService.getBySpel(key);
        return list;
    }

}
