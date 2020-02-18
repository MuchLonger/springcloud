package com.cq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @Time: 2019/11/23 17:06
 */
@SpringBootApplication(scanBasePackages = {"service","com.cq"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"service"})
public class MicroServiceCloudConsumerDept_9002_feign {
    public static void main(String[] args){
        SpringApplication.run(MicroServiceCloudConsumerDept_9002_feign.class,args);
    }

}
