package com.dragon.service;

import com.dragon.model.dto.OnlineUserDTO;
import com.dragon.model.vo.UserVO;

/**
 * OnlineUserService
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 18:30
 */
public interface OnlineUserService {

    /**
     * 添加在线用户
     *
     * @param user 在线用户实体类
     * @return 用户实体类
     */
    UserVO addOnlineUser(OnlineUserDTO user);


    /**
     * 根据token删除在线用户
     *
     * @param token token
     * @return 是否添加成功
     */
    boolean deleteOnlineUserByToken(String token);

    /**
     * 根据token获取
     *
     * @param token token
     * @return 用户展示实体类
     */
    UserVO getLoginUserByToken(String token);

}
