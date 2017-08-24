package com.iflytek.service;

import java.util.List;

import com.iflytek.bean.Node;

public interface NodeService {
    
    public Node find(Long id);
    
    void delete(Long id);
    
    List<Node> findAll();
}
