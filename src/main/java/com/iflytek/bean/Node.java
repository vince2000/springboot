package com.iflytek.bean;

import java.io.Serializable;

public class Node implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 8674320460027876219L;
    
    private Long id;
    
    private Long stepId;
    
    private String left;
    
    private String top;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getStepId() {
        return stepId;
    }
    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }
    public String getLeft() {
        return left;
    }
    public void setLeft(String left) {
        this.left = left;
    }
    public String getTop() {
        return top;
    }
    public void setTop(String top) {
        this.top = top;
    }
    @Override
    public String toString() {
        return "Node [id=" + id + ", stepId=" + stepId + ", left=" + left
                + ", top=" + top + "]";
    }
    
    
}
