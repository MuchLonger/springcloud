package com.cq.controller;

import Entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import service.DeptClientService;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/23 16:45
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;
    @PostMapping("/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }
    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }
    @GetMapping("/list")
    public List<Dept> list() {
        return deptClientService.list();
    }
}
