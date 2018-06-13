package com.alibaba.cloud.service;

import java.util.List;

import com.alibaba.cloud.entity.Dept;

/**
 * DeptService
 *
 * @author joy  on 2018/6/8
 */
public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
