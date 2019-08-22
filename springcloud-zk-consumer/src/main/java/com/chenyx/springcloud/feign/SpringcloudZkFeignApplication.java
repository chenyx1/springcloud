package com.chenyx.springcloud.feign;

import com.chenyx.springcloud.ribbon.rule.DefineRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "springcloud-zk-provider")
public class SpringcloudZkFeignApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringcloudZkFeignApplication.class,args);
    }

}
