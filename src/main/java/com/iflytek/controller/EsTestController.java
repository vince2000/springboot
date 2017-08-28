package com.iflytek.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iflytek.bean.City;
import com.iflytek.service.CityService;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchProperties;
@RestController
@RequestMapping
public class EsTestController {

    @Autowired
    CityService cs;
    @RequestMapping(value="addCity",method=RequestMethod.POST)
    public void test1(){
        City c = new City();
        c.setCityname("合肥");
        c.setDescription("雾霾");
        c.setId(12L);
        c.setProvinceid(1L);
        cs.saveCity(c);
    }
    
    @RequestMapping(value="findCity",method=RequestMethod.POST)
    public void test2(){
       
      List<City> list = cs.searchCity(1, 2, "合肥");
      for(City c:list){
          System.out.println(c.toString());
      }
    }
    
    @RequestMapping(value="findCityS",method=RequestMethod.POST)
    public void test3(){  
      Iterable<City> list = cs.findAll();
      Iterator<City> it = list.iterator();
      while(it.hasNext()){
          System.out.println(it.next().toString());
      }
    }
}
