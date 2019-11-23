package com.dragon.interceptor;

import com.dragon.exception.DragonException;
import com.dragon.model.dto.UserDTO;
import com.dragon.model.vo.UserVO;
import com.dragon.service.OnlineUserService;
import com.dragon.utils.UserUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TokenInterceptor
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 00:19
 */
public class TokenInterceptor extends BaseInterceptor {

    private final String TOKEN = "token";

    @Autowired
    private OnlineUserService onlineUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String token = null;
        //获取cookie中的token
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (TOKEN.equals(cookie.getName())) {
                    token = cookie.getValue();
                }
            }
        } else {
            throw new DragonException("登录异常!!");
        }
        if (StringUtils.isBlank(token)) {
            throw new DragonException("请先登录!!");
        }

        UserVO userVO = onlineUserService.getLoginUserByToken(token);
        //如果能查询出user,证明是在线用户
        if (null != userVO) {
            UserDTO currentUser = new UserDTO();
            BeanUtils.copyProperties(userVO, cookies);
            UserUtils.setCurrentToken(token);
            UserUtils.setCurrentUser(currentUser);
            return true;
        }
        return false;
    }
}
