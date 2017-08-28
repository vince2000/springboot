package com.iflytek.dao.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.iflytek.bean.City;


public interface CityRepository extends ElasticsearchRepository<City, Long>{

}
