package com.dragon.service.impl;

import com.dragon.exception.DragonException;
import com.dragon.mapper.UserMapper;
import com.dragon.model.dto.UserDTO;
import com.dragon.model.query.PassWordChangeQuery;
import com.dragon.service.UserService;
import com.dragon.utils.DigestUtils;
import com.dragon.utils.LoginParamType;
import com.dragon.utils.UserUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * UserServiceImpl
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getLoginUser(String loginParam, String password) {
        verificationLoginParam(loginParam, password);
        int loginType = LoginParamType.getLoginParamType(loginParam);
        UserDTO user = null;
        //登录类型校验
        if (LoginParamType.EMAIL == loginType) {
            user = userMapper.selectUserByEmail(loginParam);
        } else {
            user = userMapper.selectUserByNickName(loginParam);
        }
        //密码校验
        boolean check = verificationPassword(user, password);
        if (!check) {
            throw new DragonException("用户名或密码错误");
        }
        UserUtils.infoDesensitization(user);
        return user;
    }

    @Override
    public boolean updatePassWord(PassWordChangeQuery query) {
        if (null == query || StringUtils.isBlank(query.getFirstPassword()) ||
                StringUtils.isBlank(query.getRepeatPassword()) || StringUtils.isBlank(query.getPassword())) {
            throw new DragonException("两次密码不能为空");
        }
        if (!(query.getFirstPassword().equals(query.getRepeatPassword()))) {
            throw new DragonException("两次密码不一致");
        }
        Optional<UserDTO> optionalUser = UserUtils.getCurrentUser();
        UserDTO currentUser = optionalUser.get();
        UserDTO user = userMapper.getPassWordByNickName(currentUser.getNickName());
        //密码校验
        String truePassword = user.getPassword();
        String md5Password = DigestUtils.getMD5(query.getPassword() + user.getPrivateKey());
        if (!(truePassword.equals(md5Password))) {
            throw new DragonException("密码错误");
        }
        UserDTO updateUser = new UserDTO();
        updateUser.setId(user.getId());
        updateUser.setPassword(query.getFirstPassword());
        return userMapper.updatePasswordById(updateUser) > 0;
    }

    /**
     * 校验登录信息是否为空
     *
     * @param loginParam 登录参数
     * @param password   密码
     */
    private void verificationLoginParam(String loginParam, String password) {
        if (StringUtils.isBlank(loginParam)) {
            throw new DragonException("请正确输入昵称/邮箱");
        }
        if (StringUtils.isBlank(password)) {
            throw new DragonException("请输入密码!");
        }
    }

    /**
     * 校验密码
     *
     * @param user     用户对象
     * @param password 密码
     */
    private boolean verificationPassword(UserDTO user, String password) {
        if (null == user) {
            return false;
        }
        String truePassword = user.getPassword();
        String md5Password = DigestUtils.getMD5(password + user.getPrivateKey());
        return truePassword.equals(md5Password);
    }
}
