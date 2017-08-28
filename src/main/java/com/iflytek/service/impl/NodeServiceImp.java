package com.iflytek.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.iflytek.bean.Node;
import com.iflytek.dao.NodeDao;
import com.iflytek.service.NodeService;

@Service
public class NodeServiceImp implements NodeService{

    @Autowired
    NodeDao ndao;
    
    @Autowired
    RedisTemplate<String,Serializable> redis;
    
    public Node find(Long id){
        Node Node = ndao.find(id);
        BoundValueOperations<String, Serializable> customerState =
                redis.boundValueOps("testSpringbootRedis");
        customerState.set(Node);
        return Node;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        redis.delete("testSpringbootRedis");
        ndao.delete(id);
    }

    @Override
    public List<Node> findAll() {
        // TODO Auto-generated method stub
        return ndao.findAll();
    }
    
}
