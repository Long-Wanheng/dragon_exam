package com.dragon.service;

import com.dragon.model.dto.UserDTO;
import com.dragon.model.query.PassWordChangeQuery;

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

    /**
     * 修改用户密码
     *
     * @param query 条件
     * @return 是否成功
     */
    boolean updatePassWord(PassWordChangeQuery query);
}
