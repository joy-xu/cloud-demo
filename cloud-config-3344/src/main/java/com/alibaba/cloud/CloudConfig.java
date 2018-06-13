package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * CloudConfig
 *
 * @author joy  on 2018/6/13
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfig {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfig.class, args);
    }
}
