package com.dragon.utils;

import com.dragon.model.dto.UserDTO;

import java.util.Optional;

/**
 * UserUtils
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 17:54
 */
public class UserUtils {
    /**
     * 保证每个线程有独立用户属性
     */
    private static ThreadLocal<UserDTO> currentUser = new ThreadLocal<UserDTO>();
    private static ThreadLocal<String> currentToken = new ThreadLocal<String>();

    public static void setCurrentUser(UserDTO user) {
        infoDesensitization(user);
        currentUser.set(user);
    }

    public static Optional<UserDTO> getCurrentUser() {
        return Optional.of(currentUser.get());
    }

    public static void setCurrentToken(String token) {
        currentToken.set(token);
    }

    public static Optional<String> getCurrentToken() {
        return Optional.of(currentToken.get());
    }

    public static void remove() {
        currentUser.remove();
        currentToken.remove();
    }

    public static void infoDesensitization(UserDTO user) {
        if (null == user) {
            return;
        }
        user.setPassword(null);
        user.setId(null);
        user.setPrivateKey(null);
    }
}
