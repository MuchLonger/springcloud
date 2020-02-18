package com.cq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @Time: 2019/11/28 21:33
 */
@SpringBootApplication
@EnableZuulProxy  //启用Zuul
public class MicroServiceGateWayZuul_9527 {
    public static void main(String[] args){
        SpringApplication.run(MicroServiceGateWayZuul_9527.class,args);
    }
}
