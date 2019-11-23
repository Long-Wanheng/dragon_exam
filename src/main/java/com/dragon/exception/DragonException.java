package com.dragon.exception;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * DragonException
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:23
 */
@Data
public class DragonException extends RuntimeException {

    protected String code = "1";

    protected String message = "success";


    protected Object data;

    public DragonException() {
    }

    public DragonException(String message) {
        this();
        this.message = message;
    }

    public DragonException(String format, Object... objects) {
        this();
        format = StringUtils.replace(format, "{}", "%s");
        this.message = String.format(format, objects);
    }

    public DragonException(String msg, Throwable cause, Object... objects) {
        this();
        String format = StringUtils.replace(msg, "{}", "%s");
        this.message = String.format(format, objects);
    }

}
