package com.shazam.framework.entity.common;

import java.util.List;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
public class RestListResult<T> extends BaseDO {

    private List<T> data;

    private Integer status;

    private String message;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
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
}
