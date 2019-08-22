package com.chenyx.springcloud.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @desc 引入dashboard
 * @author chenyx
 * @date 2019-08-19
 * */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardApplication {

    public static void main(String [] args) {
        SpringApplication.run(DashBoardApplication.class, args);
    }
}
