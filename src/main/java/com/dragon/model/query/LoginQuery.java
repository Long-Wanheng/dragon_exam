package com.dragon.model.query;

/**
 * LoginQuery
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:25
 */
public class LoginQuery {
    /**
     * 登录参数
     */
    private String loginParam;
    /**
     * 密码
     */
    private String password;

    public String getLoginParam() {
        return loginParam;
    }

    public void setLoginParam(String loginParam) {
        this.loginParam = loginParam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
