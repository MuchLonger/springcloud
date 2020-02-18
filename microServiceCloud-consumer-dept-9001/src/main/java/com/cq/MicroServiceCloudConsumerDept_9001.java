package com.cq;

import myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @Time: 2019/11/25 21:58
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT-CQ",configuration= MySelfRule.class)
public class MicroServiceCloudConsumerDept_9001 {
    public static void main(String[] args){
        SpringApplication.run(MicroServiceCloudConsumerDept_9001.class,args);
    }
}
