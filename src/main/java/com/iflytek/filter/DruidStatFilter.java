package com.iflytek.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/** 
 * @author  lldeng2
 *
 * @date 创建时间：2017年6月14日 下午5:39:20 
 *
 * @version 1.0 
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/",initParams={
    @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
})
public class DruidStatFilter extends WebStatFilter{

}
