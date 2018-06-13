package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka1
 *
 * @author joy  on 2018/6/8
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka1 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka1.class, args);
    }
}
