/*
 * 文件名:ResponseResult.java
 * 版权: Copyright 2020-2020 Fenghuo Tech. Co. Ltd. All Rights Reserved.
 * 描述: 基础DAO接口
 *
 *************** START 修改记录 ***************
 * 版本: 1.0.0
 * 修改人: xxx
 * 修改时间: 2020/7/8 11:08
 * 修改内容: 新增
 *************** END 修改记录 ***************
 */
package com.example.springboottest.util.common;


import com.example.springboottest.util.exception.IResult;
import com.example.springboottest.util.exception.ResultEnum;

/**
 * @ClassName ResponseResultUtil.java
 * @Description ResponseResult工具类
 * @Author czp
 * @Version 1.0.0
 * @Date 2021年06月09日 18:32
 */
public class ResponseResultUtil<T> {

    /****************************************************成功相关************************************************************/
    /**
     * 成功返回结果
     *
     * @return
     */
    public static ResponseResult success() {
        return new ResponseResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), null,true);
    }

    /**
     * 成功返回结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data,true);
    }

    /**
     * 成功返回结果
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> success(T data, String message) {
        return new ResponseResult<>(ResultEnum.SUCCESS.getCode(), message, data,true);
    }

    /****************************************************失败相关************************************************************/
    /**
     * 失败返回结果
     *
     * @return
     */
    public static ResponseResult failed() {
        return failed(ResultEnum.FAILED);
    }

    /**
     * 失败返回结果
     *
     * @param result
     * @return
     */
    public static ResponseResult failed(IResult result) {
        return new ResponseResult<>(result.getCode(), result.getMessage(), null,false);
    }

    /**
     * 失败返回结果
     *
     * @param result
     * @param message
     * @return
     */
    public static ResponseResult failed(IResult result, String message) {
        return new ResponseResult<>(result.getCode(), message, null,false);
    }

    /**
     * 失败返回结果
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> failed(T data, String message) {
        return new ResponseResult<>(ResultEnum.FAILED.getCode(), message, data,false);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @return
     */
    public static ResponseResult failed(String message) {
        return new ResponseResult<>(ResultEnum.FAILED.getCode(), message, null,false);
    }

    /**
     * 失败返回结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> failed(T data) {
        return new ResponseResult<>(ResultEnum.FAILED.getCode(), ResultEnum.FAILED.getMessage(), data,false);
    }


}
