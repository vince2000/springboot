package com.iflytek.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.iflytek.test.TestMethod;

public class ClassLoadListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        new TestMethod().test("123456");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }

}
