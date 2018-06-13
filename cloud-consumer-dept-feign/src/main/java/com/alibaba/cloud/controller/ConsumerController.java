package com.alibaba.cloud.controller;

import java.util.List;

import com.alibaba.cloud.entity.Dept;
import com.alibaba.cloud.service.DeptClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerController
 *
 * @author joy  on 2018/6/8
 */
@RestController
public class ConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }
}
