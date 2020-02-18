package com.cq.springcloud.dao;

import Entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/23 15:36
 */
@Mapper  //注意不要漏了这个注解
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
