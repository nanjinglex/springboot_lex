/*
 * 文件名:IErrorCode.java
 * 版权: Copyright 2020-2020 Fenghuo Tech. Co. Ltd. All Rights Reserved.
 * 描述: 基础DAO接口
 *
 *************** START 修改记录 ***************
 * 版本: 1.0.0
 * 修改人: xxx
 * 修改时间: 2020/7/8 10:53
 * 修改内容: 新增
 *************** END 修改记录 ***************
 */
package com.example.springboottest.util.exception;

/**
 * @ClassName IResult.java
 * @Description IResult接口
 * @Author czp
 * @Version 1.0.0
 * @Date 2021年06月09日 18:32
 */
public interface IResult {
    long getCode();
    String getMessage();
}
