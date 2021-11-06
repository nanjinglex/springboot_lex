/*
 * 文件名:ResultCode.java
 * 版权: Copyright 2020-2020 Fenghuo Tech. Co. Ltd. All Rights Reserved.
 * 描述: 基础DAO接口
 *
 *************** START 修改记录 ***************
 * 版本: 1.0.0
 * 修改人: xxx
 * 修改时间: 2020/7/8 10:55
 * 修改内容: 新增
 *************** END 修改记录 ***************
 */
package com.example.springboottest.util.exception;

/**
 * @ClassName ResultEnum.java
 * @Description Result枚举
 * @Author czp
 * @Version 1.0.0
 * @Date 2021年06月09日 18:32
 */
public enum ResultEnum implements IResult {

    SUCCESS(200, "操作成功！"),
    SYSTEM_EXCEPTION(502, "系统异常！"),
    FAILED(500, "操作失败！"),

    CONNECTION_CONNECT_EXCEPTION(1000, "数据库连接异常！")


    ;

    private long code;
    private String message;
    ResultEnum(long code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public long getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
