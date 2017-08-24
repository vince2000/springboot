package com.iflytek;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//使用tomcat容器启动，jetty启动有问题，静态页面可以访问，controller无法访问
public class SpringBootStartApplication extends SpringBootServletInitializer{
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(MainAction.class);
    }
}
