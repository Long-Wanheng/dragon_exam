package com.dragon.model.dto;

import java.util.Date;

/**
 * OnlineUserDTO
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 18:08
 */
public class OnlineUserDTO {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * token
     */
    private String token;
    /**
     * 登录(创建)时间
     */
    private Date createTime;

    /**
     * 是否删除 0否 1是
     */
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "OnlineUserDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", token='" + token + '\'' +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
