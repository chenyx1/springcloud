package com.chenyx.springcloud.config;

import com.chenyx.springcloud.router.filter.DefineFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc 自定义路由filter配置
 * @author chenyx
 * @date 2019-08-21
 * */
@Configuration
public class FilterConfig {

    @Bean
    public DefineFilter defineFilter() {
        return new DefineFilter();
    }
}
