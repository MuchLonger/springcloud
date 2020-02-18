package com.cq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 * @Time: 2019/11/27 22:45
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MicroServiceCloud_10001_dashboard {
    public static void main(String[] args){
        SpringApplication.run(MicroServiceCloud_10001_dashboard.class,args);
    }
}
