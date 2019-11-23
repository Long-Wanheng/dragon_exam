package com.dragon.controller;

import com.dragon.exception.DragonException;
import com.dragon.model.dto.OnlineUserDTO;
import com.dragon.model.dto.UserDTO;
import com.dragon.model.query.LoginQuery;
import com.dragon.model.query.PassWordChangeQuery;
import com.dragon.model.vo.UserVO;
import com.dragon.service.OnlineUserService;
import com.dragon.service.UserService;
import com.dragon.utils.OnlineUserUtil;
import com.dragon.utils.ResultSet;
import com.dragon.utils.UserUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * LoginController
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:04
 */
@RestController
public class LoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private OnlineUserService onlineUserService;

    @RequestMapping("/login")
    public ResultSet login(@RequestBody LoginQuery query) {
        //参数校验
        checkParam(query);
        //执行登录
        UserDTO userDTO = userService.getLoginUser(query.getLoginParam(), query.getPassword());
        OnlineUserDTO onlineUse = new OnlineUserDTO();
        BeanUtils.copyProperties(userDTO, onlineUse);
        //设置token
        String token = OnlineUserUtil.getTokenByUser(userDTO);
        onlineUse.setToken(token);
        //添加在线用户
        UserVO userVO = onlineUserService.addOnlineUser(onlineUse);
        UserUtils.setCurrentUser(userDTO);
        UserUtils.setCurrentToken(token);
        LOGGER.info(" 用户 {} 登录成功", userVO.getNickName());
        return ResultSet.view(userVO);
    }

    @RequestMapping("/logout")
    public ResultSet logout() {
        Optional<String> token = UserUtils.getCurrentToken();
        return ResultSet.view(onlineUserService.deleteOnlineUserByToken(token.get()));
    }

    @RequestMapping("/passwordChange")
    public ResultSet passwordChange(PassWordChangeQuery query) {
        return ResultSet.view(userService.updatePassWord(query));
    }


    private void checkParam(LoginQuery query) {
        if (null == query || StringUtils.isBlank(query.getLoginParam()) || StringUtils.isBlank(query.getPassword())) {
            throw new DragonException("登录信息不能为空!");
        }
    }

}
