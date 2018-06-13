package com.alibaba.cloud.service.impl;

import java.util.List;

import com.alibaba.cloud.dao.DeptDao;
import com.alibaba.cloud.entity.Dept;
import com.alibaba.cloud.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DeptServiceImpl
 *
 * @author joy  on 2018/6/8
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
