package com.dragon.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * LoginParamType
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:24
 */
public class LoginParamType {
    public static final int EMAIL = 1;
    public static final int NAME = 2;

    private static final Pattern EMAIL_RULE = Pattern.compile("\\w+@\\w+(\\.\\w+)+");

    /**
     * 获取当前登录类型
     *
     * @param parames
     * @return 状态码
     */
    public static Integer getLoginParamType(String parames) {
        Matcher emailMatcher = EMAIL_RULE.matcher(parames);
        if (emailMatcher.find()) {
            return EMAIL;
        } else {
            return NAME;
        }
    }
}
