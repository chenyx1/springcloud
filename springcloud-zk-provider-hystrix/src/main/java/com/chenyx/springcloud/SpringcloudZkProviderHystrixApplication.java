package com.chenyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringcloudZkProviderHystrixApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringcloudZkProviderHystrixApplication.class,args);
    }
}
