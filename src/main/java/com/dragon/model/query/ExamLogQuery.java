package com.dragon.model.query;

import java.util.Date;

/**
 * ExamLogQuery
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:46
 */
public class ExamLogQuery extends PageQuery {
    /**
     * 学生姓名
     */
    private String stuName;
    /**
     * 学生姓名模糊查询
     */
    private String stuNameLike;
    /**
     * 科目id
     */
    private Long subId;
    /**
     * 是否通过 0 通过 1 未通过
     */
    private Integer status;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date stopTime;


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNameLike() {
        return stuNameLike;
    }

    public void setStuNameLike(String stuNameLike) {
        this.stuNameLike = stuNameLike;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        return "ExamLogQuery{" +
                "stuName='" + stuName + '\'' +
                ", stuNameLike='" + stuNameLike + '\'' +
                ", subId=" + subId +
                ", status=" + status +
                ", startTime=" + startTime +
                ", stopTime=" + stopTime +
                '}';
    }
}
