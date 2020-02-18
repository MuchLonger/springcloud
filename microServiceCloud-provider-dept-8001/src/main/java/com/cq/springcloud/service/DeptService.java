package com.cq.springcloud.service;

import Entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/23 15:42
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
