package com.alibaba.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义LB规则
 *
 * @author joy  on 2018/6/11
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule uniqueRule() {
        return new MyRule();
    }
}
