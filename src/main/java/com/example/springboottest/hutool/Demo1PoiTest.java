package com.example.springboottest.hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.sax.Excel03SaxReader;
import cn.hutool.poi.excel.sax.handler.RowHandler;
import jodd.io.FileUtil;

import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1PoiTest.java
 * @Description TODO
 * @createTime 2021年11月24日 14:54:00
 */
public class Demo1PoiTest {
    public static void main(String[] args) {
//1常规读取
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("C:\\Users\\admin、\\Desktop\\test.xlsx"));
        List<List<Object>> read = reader.read();
        read.stream().forEach(System.out::println);


        ExcelUtil.readBySax("C:\\Users\\admin、\\Desktop\\test.xls", 0, createRowHandler());

        //03版本读取
        Excel03SaxReader reader1 = new Excel03SaxReader(createRowHandler());
        reader1.read("C:\\Users\\admin、\\Desktop\\test.xls", 0);
    }

    private static RowHandler createRowHandler() {

        return (sheetIndex, rowIndex, rowlist) ->
                Console.log("[{}] [{}] {}", sheetIndex, rowIndex, rowlist);
//        return new RowHandler() {
//            @Override
//            public void handle(int sheetIndex, long rowIndex, List<Object> rowlist) {
//                Console.log("[{}] [{}] {}", sheetIndex, rowIndex, rowlist);
//            }
//        };
    }


}
