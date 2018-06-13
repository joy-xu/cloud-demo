package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka3
 *
 * @author joy  on 2018/6/8
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3.class, args);
    }
}
