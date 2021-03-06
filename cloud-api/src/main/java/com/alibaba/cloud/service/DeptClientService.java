package com.alibaba.cloud.service;

import java.util.List;

import com.alibaba.cloud.entity.Dept;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DeptClientServiceClient
 *
 * @author joy  on 2018/6/12
 */
//@FeignClient(value = "CLOUD-DEPT-PROVIDER")
@FeignClient(value = "CLOUD-DEPT-PROVIDER", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);

}
