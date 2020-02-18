package com.cq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @Time: 2019/11/28 22:53
 */
@SpringBootApplication
@EnableConfigServer
public class MicroServiceCloudConfig_6666 {
    public static void main(String[] args){
        SpringApplication.run(MicroServiceCloudConfig_6666.class,args);
    }
}
