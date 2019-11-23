package com.dragon.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * BaseInterceptor
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 00:20
 */
public class BaseInterceptor extends HandlerInterceptorAdapter {
    protected final Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
    private BaseInterceptor[] nextInterceptor;

    public void setNextInterceptor(BaseInterceptor... nextInterceptor) {
        this.nextInterceptor = nextInterceptor;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (nextInterceptor == null) {
            return true;
        }
        for (int i = 0; i < nextInterceptor.length; i++) {
            if (!nextInterceptor[i].preHandle(request, response, handler)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if (nextInterceptor != null) {
            for (int i = 0; i < nextInterceptor.length; i++) {
                nextInterceptor[i].postHandle(request, response, handler, modelAndView);
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        if (nextInterceptor != null) {
            for (int i = 0; i < nextInterceptor.length; i++) {
                nextInterceptor[i].afterCompletion(request, response, handler, ex);
            }
        }
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (nextInterceptor != null) {
            for (int i = 0; i < nextInterceptor.length; i++) {
                nextInterceptor[i].afterConcurrentHandlingStarted(request, response, handler);
            }
        }
    }
}
