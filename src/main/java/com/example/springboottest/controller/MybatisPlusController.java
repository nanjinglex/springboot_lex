package com.example.springboottest.controller;

import com.example.springboottest.service.MybatisPlusService;
import com.example.springboottest.util.common.ResponseResult;
import com.example.springboottest.util.common.ResponseResultUtil;
import com.example.springboottest.util.exception.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName MybatisPlusController.java
 * @Description TODO
 * @createTime 2021年08月20日 15:24:00
 */

@Api(tags = "MybatisPlusController", description = "MybatisPlus操作Controller")
@RestController
@RequestMapping("/mybatisPlus")
@Slf4j
public class MybatisPlusController {

    @Autowired
    private MybatisPlusService mybatisPlusService;

    /**
     * 删除任务配置
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除")
    public ResponseResult deleteFlinkJobConfig(@PathVariable String id) {
        log.info("删除FlinkJobConfig,参数id:{}",id);
        try {
            mybatisPlusService.deleteById(id);
        } catch (BusinessException be) {
            log.warn("deleteFlinkJobConfig is error ", be);
            return ResponseResultUtil.failed(be.getMessage());
        } catch (Exception e) {
            log.error("deleteFlinkJobConfig is error", e);
            return ResponseResultUtil.failed(e.getMessage());
        }
        return ResponseResultUtil.success();
    }



}



