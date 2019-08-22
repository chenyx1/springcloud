package com.chenyx.springcloud.ribbon.config;


import com.chenyx.springcloud.ribbon.rule.DefineRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc Ribbon的配置信息
 * @author chenyx
 * @date 2019-08-13
 *
 *
 * */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule getLoadBanlanceRule() {
        return new RandomRule();
    }
}
