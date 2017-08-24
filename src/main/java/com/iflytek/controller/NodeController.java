package com.iflytek.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.github.pagehelper.PageHelper;
import com.iflytek.bean.Node;
import com.iflytek.service.NodeService;
@RestController
@EnableAutoConfiguration
@RequestMapping
public class NodeController {

    @Autowired
    NodeService nservice;
    
    Log log = LogFactory.getLog(NodeController.class);
    
    @RequestMapping(value="add/findById",method=RequestMethod.POST)
    public void find(Long id){
        log.info("方法的入参是："+id);
        Node n = nservice.find(id);
        System.out.println(n.toString());
    }
    
    @RequestMapping(value="test/findAll",method=RequestMethod.POST)
    public void findALl(int pageNum,int pageSize){
        //log.info("方法的入参是："+id);
        PageHelper.startPage(pageNum, pageSize);
        List<Node> n = nservice.findAll();
        for(Node no:n){
            System.out.println(no.toString());
        }
    }
    
    @RequestMapping(value="delete",method=RequestMethod.POST)
    public void add(Long id){
        
       nservice.delete(id);
    }
}
