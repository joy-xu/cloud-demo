package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * DeptProvider
 *
 * @author joy  on 2018/6/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider1 {


    public static void main(String[] args) {
        SpringApplication.run(DeptProvider1.class, args);
    }
}
