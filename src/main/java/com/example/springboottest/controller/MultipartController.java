package com.example.springboottest.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import jodd.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName MultipartController.java
 * @Description
 * @createTime 2021年12月03日 15:08:00
 */
@RestController
@RequestMapping("/multi")
@Slf4j
public class MultipartController {

    @PostMapping("/upload")
    public String upload(@RequestParam(name = "name") String name, @RequestPart(name = "file") MultipartFile file) throws Exception {
        log.info("上传的信息：name={}，file={}", name, file.getSize());
        if(!file.isEmpty()){
            String originalFilename = file.getOriginalFilename();
            if(!originalFilename.endsWith("xlsx") || !originalFilename.endsWith("xls")){
                throw new Exception("不是Excel文件");
            }
            file.transferTo(new File("d:\\cache\\"+originalFilename));
        }


        //1常规读取

        ExcelReader reader = ExcelUtil.getReader(file.getInputStream());


        List<List<Object>> read = reader.read();
        read.stream().forEach(System.out::println);
        return "上传成功";
    }
}
