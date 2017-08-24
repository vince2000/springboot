package com.iflytek.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iflytek.bean.Node;

@Mapper
public interface NodeDao {

    public Node find(Long id);
    
    void delete(Long id);
    
    List<Node> findAll();
}
