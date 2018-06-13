package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * HystrixDashBoardApp
 *
 * @author joy  on 2018/6/12
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboardApp.class, args);
    }
}
