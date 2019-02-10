package com.shazam.framework.entity.common;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
public class RestResult<T> extends BaseDO{

    private T data;

    private Integer status;

    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static <T> RestResult success(T data,RestResult<T> result){
        result.setData(data);
        result.setStatus(0);
        result.setMessage("ok");
        return result;
    }
}
