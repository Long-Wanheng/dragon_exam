package com.dragon.mapper;

import com.dragon.model.dto.OnlineUserDTO;
import com.dragon.model.vo.UserVO;
import org.apache.ibatis.annotations.Param;

/**
 * OnLineUserMapper
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 18:10
 */
public interface OnLineUserMapper {

    /**
     * 添加在线用户
     *
     * @param onlineUserDTO 在线用户实体类
     * @return 添加条数
     */
    int addOnlineUser(@Param("onlineUser") OnlineUserDTO onlineUserDTO);

    /**
     * 根据token删除在线用户
     *
     * @param token token
     * @return 删除条数
     */
    int deleteOnlineUserByToken(@Param("token") String token);

    /**
     * 根据token获取
     *
     * @param token token
     * @return 用户展示实体类
     */
    UserVO getLoginUserByToken(@Param("token") String token);
}
