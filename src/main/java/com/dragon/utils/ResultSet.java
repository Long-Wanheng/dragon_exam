package com.dragon.utils;

/**
 * ResultSet
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:23
 */
public class ResultSet {
    /**
     * 状态码
     */
    private int code = 0;
    /**
     * 信息
     */
    private String message = "success";
    /**
     * 数据
     */
    private Object data;

    public ResultSet() {
    }

    public ResultSet(Object data) {
        this.data = data;
    }

    public ResultSet(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultSet(Object data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static ResultSet view(Object data) {
        return new ResultSet(data);
    }

    public static ResultSet view(int code, String message) {
        return new ResultSet(code, message);
    }

    public static ResultSet view(Object data, int code, String message) {
        return new ResultSet(data, code, message);
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
