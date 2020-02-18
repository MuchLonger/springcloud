package com.cq.springcloud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 服务发现类
 * @Time: 2019/11/24 12:54
 */
@RestController
public class DiscoveryController {
    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();  //找到当前eureka所有的服务
        System.out.println("**********" + list);  // 打印所有的服务

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT-QY"); //通过名字找到当前服务
        for (ServiceInstance element : srvList) {
            // 控制台上打印当前 url
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
