package com.iflytek.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "cityindex", type = "city",shards = 2, replicas = 1, 
refreshInterval = "-1") 
public class City implements Serializable{
    //index 配置必须是全部小写，不然会引出异常：
    /**
     * 
     */
    private static final long serialVersionUID = 1254587185107793385L;

    /** 
     * 城市编号 
     */ 
    @Id
    private Long id; 
 
    /** 
     * 省份编号 
     */ 
    private Long provinceid; 
 
    /** 
     * 城市名称 
     */ 
    private String cityname; 
 
    /** 
     * 描述 
     */ 
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", provinceid=" + provinceid + ", cityname="
                + cityname + ", description=" + description + "]";
    } 
    
    
}
