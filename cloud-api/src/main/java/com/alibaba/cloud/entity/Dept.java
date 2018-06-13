package com.alibaba.cloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Dept
 *
 * @author joy  on 2018/6/8
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Dept implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String dbSource;

    public Dept(String deptName) {
        super();
        this.deptName = deptName;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        
        dept.setId(1L).setDeptName("aaa").setDbSource("db_1");

        System.out.println(dept);
    }
}
