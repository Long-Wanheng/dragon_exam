package com.dragon;

import com.alibaba.fastjson.JSONObject;
import com.dragon.model.dto.UserDTO;
import com.dragon.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserServiceTest
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetLoginUser() {
        long startTime = System.currentTimeMillis();
        String loginParam = "龙万恒";
        String passWord = "123456";
        UserDTO user = null;
        try {
            user = userService.getLoginUser(loginParam, passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime - startTime;
        System.out.println("test spend time :" + time);
        System.out.println("test date is -->" + JSONObject.toJSONString(user));
    }
}
