package com.dragon.service;

import com.dragon.model.dto.UserDTO;

/**
 * UserService
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:21
 */
public interface UserService {

    /**
     * 根据参数获取登录用户
     *
     * @param loginParam
     * @param password
     * @return 登录用户
     */
    UserDTO getLoginUser(String loginParam, String password);
}
