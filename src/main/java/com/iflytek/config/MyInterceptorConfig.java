package com.iflytek.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.iflytek.intercept.MyHandlerInterceptor;

@Configuration
public class MyInterceptorConfig extends WebMvcConfigurerAdapter{
    
    /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor())
                //添加需要验证登录用户操作权限的请求
                .addPathPatterns("/add/*")
                //排除不需要验证登录用户操作权限的请求
                .excludePathPatterns("/test/*");
    }
}
