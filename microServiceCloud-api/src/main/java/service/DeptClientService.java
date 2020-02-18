package service;

import Entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/25 21:34
 */
@Service
@FeignClient(value = "MICROSERVICECLOUD-DEPT-CQ",fallbackFactory = DeptClientServiceFallbackFactory.class)  //声明使用哪个提供者
public interface DeptClientService {
    @RequestMapping("/dept/add")
    boolean add(Dept dept);
    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();
}
