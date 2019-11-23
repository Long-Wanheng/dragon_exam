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
     * 根据uuid删除在线用户
     *
     * @param uuid uuid
     * @return 删除条数
     */
    int deleteOnlineUserByUUID(@Param("uuid") String uuid);

    /**
     * 根据uuid获取
     *
     * @param uuid uuid
     * @return 用户展示实体类
     */
    UserVO getLoginUserByUUID(@Param("uuid") String uuid);
}
