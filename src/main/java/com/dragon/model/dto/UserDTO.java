package com.dragon.model.dto;

import java.util.Date;

/**
 * UserDTO
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:09
 */
public class UserDTO {
    /**
     * 用户id
     */
    private Long id;
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
     * 用户密码
     */
    private String password;
    /**
     * 用户私钥
     */
    private String privateKey;

    /**
     * 用户创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
