package com.iflytek.config;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.github.pagehelper.PageHelper;

@Configuration
public class PageHelperConfig {
    
    Log log = LogFactory.getLog(PageHelperConfig.class);
    
    @Bean
    public PageHelper pageHelper() {
        log.info("------注册了分页插件的bean");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        //通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
        p.setProperty("pageSizeZero", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
    
}
