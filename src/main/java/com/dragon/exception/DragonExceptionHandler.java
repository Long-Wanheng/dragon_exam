package com.dragon.exception;

import com.dragon.utils.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * DragonExceptionHandler
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:23
 */
@ControllerAdvice
@RestControllerAdvice
public class DragonExceptionHandler {
    private Logger lOgger = LoggerFactory.getLogger(DragonExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResultSet errorMsg(Exception ex) {
        ex.printStackTrace();
        if (ex instanceof DragonException) {
            return new ResultSet(-1, ex.getMessage());
        } else {
            return new ResultSet(-1, "未知错误");
        }
    }
}
