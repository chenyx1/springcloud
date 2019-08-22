package com.chenyx.springcloud.feign;

import com.chenyx.springcloud.ribbon.rule.DefineRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "SPRINGCLOUD-EUREKA-PROVIDER",configuration = DefineRule.class)
public class SpringcloudFeignApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class,args);
    }

}
