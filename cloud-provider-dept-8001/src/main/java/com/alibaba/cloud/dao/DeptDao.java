package com.alibaba.cloud.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.alibaba.cloud.entity.Dept;

import org.springframework.stereotype.Repository;

/**
 * DeptDao
 *
 * @author joy  on 2018/6/8
 */
@Repository
public class DeptDao {

    private Map<Long, Dept> depts = new HashMap<>(16);

    @PostConstruct
    private void init() {
        depts.put(1L, new Dept(8001L, "8001", "dbSource1"));
        depts.put(2L, new Dept(8002L, "8001", "dbSource1"));
        depts.put(3L, new Dept(8003L, "8001", "dbSource1"));

    }

    public boolean addDept(Dept dept) {
        depts.put(dept.getId(), dept);
        return true;
    }

    public Dept findById(Long id) {
        return depts.get(id);
    }

    public List<Dept> findAll() {
        return new ArrayList<>(depts.values());
    }

}
