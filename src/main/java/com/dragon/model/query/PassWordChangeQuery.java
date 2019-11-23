package com.dragon.model.query;

/**
 * PassWordChangeQuery
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:32
 */
public class PassWordChangeQuery {
    /**
     * 用户第一次输入密码
     */
    private String firstPassword;
    /**
     * 用户第二次输入密码
     */
    private String repeatPassword;
    /**
     * 用户登录密码
     */
    private String password;

    public String getFirstPassword() {
        return firstPassword;
    }

    public void setFirstPassword(String firstPassword) {
        this.firstPassword = firstPassword;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
