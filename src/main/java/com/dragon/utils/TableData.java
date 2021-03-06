package com.dragon.utils;

import java.util.List;

/**
 * TableData
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:23
 */
public class TableData<T> {
    /**
     * 状态码
     */
    private int code = 0;
    /**
     * 信息
     */
    private String message = "success";
    /**
     * 总条数
     */
    private Long count = 0L;
    /**
     * 页数
     */
    private Integer pageNum = 1;
    /**
     * 每页条数
     */
    private Integer pageSize = 10;
    /**
     * 数据
     */
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
