package com.example.springboottest.util.exception;

/**
 * @ClassName BusinessException.java
 * @Description 业务异常类
 * @Author czp
 * @Version 1.0.0
 * @Date 2021年06月09日 18:32
 */
public class BusinessException extends RuntimeException {

    private transient IResult iResult;

    public BusinessException(IResult iResult) {
        super(iResult.getMessage());
        this.iResult = iResult;
    }

    public BusinessException(IResult iResult, String message) {
        super(message);
        this.iResult = iResult;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public IResult getIResult() {
        return iResult;
    }
    
}
