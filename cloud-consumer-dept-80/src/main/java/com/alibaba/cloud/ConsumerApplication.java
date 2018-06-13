package com.alibaba.cloud;

import com.alibaba.rule.MyRuleConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * ConsumerApplication
 *
 * @author joy  on 2018/6/8
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-DEPT-PROVIDER", configuration = MyRuleConfig.class)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
