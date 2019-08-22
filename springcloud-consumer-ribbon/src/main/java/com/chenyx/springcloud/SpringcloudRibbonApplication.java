package com.chenyx.springcloud;


import com.chenyx.ribbon.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @desc 学习 springcoud-netflix-ribbon
 * @author chenyx
 * @date 2109-08-12
 *
 * */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "SPRINGCLOUD-EUREKA-PROVIDER",configuration = RibbonConfig.class)
public class SpringcloudRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonApplication.class,args);
    }
}
