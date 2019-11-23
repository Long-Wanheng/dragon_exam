package com.dragon.model.vo;

/**
 * UserVO
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 18:22
 */
public class UserVO {
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户真名
     */
    private String realName;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户手机号
     */
    private String phoneNumber;
    /**
     * uuid
     */
    private String uuid;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
