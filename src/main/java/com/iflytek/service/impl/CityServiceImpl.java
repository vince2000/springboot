package com.iflytek.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import com.iflytek.dao.es.*;
import com.iflytek.bean.City;
import com.iflytek.service.CityService;
@Service
public class CityServiceImpl implements CityService{

    Log log =LogFactory.getLog(this.getClass());
    
    @Autowired 
    CityRepository cityRepository; 
    
    @Override
    public Long saveCity(City city) {
        // TODO Auto-generated method stub
        City cityResult = cityRepository.save(city); 
        return cityResult.getId(); 
    }

    @Override
    public List<City> searchCity(Integer pageNumber, 
            Integer pageSize, 
            String searchContent) {
        // 分页参数 
        Pageable pageable = new PageRequest(pageNumber, pageSize); 
 
        // Function Score Query 
        //FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery().add(ScoreFunctionBuilders.weightFactorFunction(1000)).add(ScoreFunctionBuilders.weightFactorFunction(100)); 
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()

                .add(ScoreFunctionBuilders.weightFactorFunction(1000))

                .add(ScoreFunctionBuilders.weightFactorFunction(100));
        
        // 创建搜索 DSL 查询 
        SearchQuery searchQuery = new NativeSearchQueryBuilder() 
                .withPageable(pageable) 
                .withQuery(functionScoreQueryBuilder).build(); 
 
        log.info("\n searchCity(): searchContent [" + searchContent + "] \n DSL  = \n " + searchQuery.getQuery().toString()); 
 
        Page<City> searchPageResults = cityRepository.search(searchQuery); 
        return searchPageResults.getContent(); 
    }

    @Override
    public Iterable<City> findAll() {
        // TODO Auto-generated method stub
        return cityRepository.findAll();
    }

}
