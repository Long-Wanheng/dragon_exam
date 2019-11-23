package com.dragon.model.vo;

import com.dragon.model.dto.ExamLogDTO;

/**
 * ExamLogVO
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:44
 */
public class ExamLogVO extends ExamLogDTO {
    /**
     * 科目名
     */
    private String subName;
    /**
     * 缴费金额
     */
    private Integer payment;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ExamLogVO{" +
                "subName='" + subName + '\'' +
                ", payment=" + payment +
                '}';
    }
}
