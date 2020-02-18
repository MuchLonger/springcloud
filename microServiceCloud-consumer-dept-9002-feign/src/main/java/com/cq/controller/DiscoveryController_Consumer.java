package com.cq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @Time: 2019/11/24 13:07
 */
@RestController
public class DiscoveryController_Consumer {
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT-CQ";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery()
    {
        // 直接调用到provider开放的url，获取到对应provider的信息
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }
}
