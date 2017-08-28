package com.iflytek.service;

import java.util.List;

import com.iflytek.bean.City;

public interface CityService {

    public Long saveCity(City city);
    
    public List<City> searchCity(Integer pageNumber, 
            Integer pageSize, 
            String searchContent);
    
    public  Iterable<City>  findAll();
}
