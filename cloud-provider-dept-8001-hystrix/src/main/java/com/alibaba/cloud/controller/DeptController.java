package com.alibaba.cloud.controller;

import com.alibaba.cloud.entity.Dept;
import com.alibaba.cloud.service.DeptService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DeptController
 *
 * @author joy  on 2018/6/8
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @HystrixCommand(fallbackMethod = "processHystrixError")
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);

        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return dept;
    }

    public Dept processHystrixError(@PathVariable("id") Long id) {
        return new Dept().setId(id).setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
            .setDbSource("no this database in MySQL");
    }

}
