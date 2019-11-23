package com.dragon.model.enums;

/**
 * DeleteEnum
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 00:52
 */
public enum DeleteEnum {
    /**
     * 未删除
     */
    NO_DELETE(0, "未删除"),
    DELETE(1, "已删除");

    /**
     * value
     */
    private int value;
    /**
     * 备注
     */
    private String desc;

    DeleteEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
