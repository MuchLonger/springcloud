package com.cq.springcloud.Controller;

import Entities.Dept;
import com.cq.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/23 15:52
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){

        return deptService.add(dept);
    }
    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "occurDeptException")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if(dept==null)
            throw new RuntimeException("找不到id为这个的记录");
        return dept;
    }
    private Dept occurDeptException(@PathVariable("id")Long id){
        // 当异常发生时，构建一个提醒对象。
        return new Dept().setDeptNo(0L)
                .setDName("找不到这个部门"+id+"通过 @HystrixCommand")
                .setDbSource("不告诉你什么数据库");  //因为Entities内的Lombok启用了@Accessors(chain = true)注解，启用了链式（即会返回this）
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }
}
