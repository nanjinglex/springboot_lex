
package com.example.springboottest.util.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * ResponseResult
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -7090019282307269743L;

    private long code;
    private String message;
    private T data;
    private boolean success = true;

}
