package com.dragon.model.query;

/**
 * PageQuery
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:08
 */
public class PageQuery {
    /**
     * 页码
     */
    private Integer pageNum = 0;
    /**
     * 偏移量
     */
    private Integer pageSize = 10;

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
}
