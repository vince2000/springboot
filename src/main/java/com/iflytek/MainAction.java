package com.iflytek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/** 
 * @author  lldeng2
 *
 * @date 创建时间：2017年6月14日 下午4:18:45 
 *springboot访问不需要加上项目名，真tm坑爹
 * @version 1.0 
 */
@SpringBootApplication//开启组件扫描和自动配置 
@ServletComponentScan
@MapperScan("com.iflytek.dao")
public class MainAction {

    
    public static void main(String[] args) {
        SpringApplication.run(MainAction.class, args);//负责启动引导应用程序
    }
}
