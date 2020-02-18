package com.cq.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @Time: 2019/11/23 16:42
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    /*@Bean
    public IRule myRule(){
        return new RandomRule();
    }*/
}
