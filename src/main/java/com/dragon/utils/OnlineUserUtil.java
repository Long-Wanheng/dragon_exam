package com.dragon.utils;

import com.dragon.model.dto.UserDTO;

/**
 * OnlineUserUtil
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 01:15
 */
public class OnlineUserUtil {

    public static String getTokenByUser(UserDTO user) {
        StringBuilder token = new StringBuilder();
        token.append(user.getNickName());
        token.append(user.getEmail());
        token.append(user.getPhoneNumber());
        token.append(System.currentTimeMillis());
        return DigestUtils.getMD5(token.toString());
    }
}
