package com.dragon.mapper;

import com.dragon.model.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

/**
 * @author : 龙万恒
 * @version :v1.0
 * @className : UserMapper
 * @date : 2019-11-23 01:10
 */
public interface UserMapper {
    /**
     * 根据昵称查询用户
     *
     * @param nickName 昵称
     * @return 用户实体
     */
    UserDTO selectUserByNickName(@Param("nickName") String nickName);

    /**
     * 根据邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户实体
     */
    UserDTO selectUserByEmail(@Param("email") String email);

}
