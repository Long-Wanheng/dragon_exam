package com.dragon.controller;

import com.dragon.exception.DragonException;
import com.dragon.model.dto.UserDTO;
import com.dragon.service.UserService;
import com.dragon.utils.ResultSet;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:04
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResultSet login(String loginParam, String password) {
        checkParam(loginParam, password);
        UserDTO userDTO = userService.getLoginUser(loginParam, password);
        return ResultSet.view(userDTO);
    }


    private void checkParam(String loginParam, String password) {
        if (StringUtils.isBlank(loginParam) || StringUtils.isBlank(password)) {
            throw new DragonException("登录信息不能为空!");
        }
    }

}
