package com.dragon.common;

import com.dragon.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * WelcomeConfig
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-23 01:00
 */
@Configuration
public class WelcomeConfig extends WebMvcConfigurationSupport {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //默认访问页面
        registry.addViewController("/").setViewName("login");
        //最先执行过滤
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 功能描述:
     * 配置静态资源,避免静态资源请求被拦截
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则, 这里假设拦截 /url 后面的全部链接
        List<String> includePathPatterns = new ArrayList<String>();
        includePathPatterns.add("/**/**");
        // excludePathPatterns 用户排除拦截
        List<String> excludePathPatterns = new ArrayList<String>();
        excludePathPatterns.add("/login");
        excludePathPatterns.add("/logout");
        registry.addInterceptor(getTokenInterceptor()).addPathPatterns(includePathPatterns).excludePathPatterns(excludePathPatterns);
    }

    @Bean
    public HandlerInterceptor getTokenInterceptor() {
        return new TokenInterceptor();
    }

}