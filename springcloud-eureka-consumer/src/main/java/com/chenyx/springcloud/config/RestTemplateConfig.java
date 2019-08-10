package com.chenyx.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //相当于applictioncontext.xml文件用于管理bean 实例
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }
}
