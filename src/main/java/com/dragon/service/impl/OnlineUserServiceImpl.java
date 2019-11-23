package com.dragon.service.impl;

import com.dragon.exception.DragonException;
import com.dragon.mapper.OnLineUserMapper;
import com.dragon.model.dto.OnlineUserDTO;
import com.dragon.model.vo.UserVO;
import com.dragon.service.OnlineUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * OnlineUserServiceImpl
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 00:39
 */
@Service
public class OnlineUserServiceImpl implements OnlineUserService {

    @Autowired
    private OnLineUserMapper onLineUserMapper;

    @Override
    public UserVO addOnlineUser(OnlineUserDTO user) {
        boolean check = checkParam(user);
        int count = 0;
        if (!check) {
            deleteOnlineUserByToken(user.getToken());
            user.setCreateTime(new Date());
            count = onLineUserMapper.addOnlineUser(user);
        }
        if (count > 0) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            return userVO;
        }
        return null;
    }

    @Override
    public boolean deleteOnlineUserByToken(String token) {
        if (StringUtils.isBlank(token)) {
            throw new DragonException("登录异常");
        }
        return onLineUserMapper.deleteOnlineUserByToken(token) == 1;
    }

    @Override
    public UserVO getLoginUserByToken(String token) {
        return onLineUserMapper.getLoginUserByToken(token);
    }

    private boolean checkParam(OnlineUserDTO user) {
        return null != user && StringUtils.isBlank(user.getToken()) &&
                null != user.getUserId() && user.getUserId().intValue() > 0;
    }
}
