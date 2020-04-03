package com.imooc.apigateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 自动刷新配置
 * @Author Miracle Luna
 * @Date 2020/4/2 12:36
 * @Version 1.0
 */
@Component
public class ZuulConfig {

    @ConfigurationProperties("zuul")
//    @RefreshScope
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
}
