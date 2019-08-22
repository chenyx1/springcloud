package com.chenyx.springcloud.hystrix.controller;

import com.chenyx.springcloud.constant.ServerConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        System.out.println("url:" + ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl());
        String result = restTemplate.getForObject(ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl() + "/springcloud-eureka-provider/getServer",String.class);
        return  result;
    }


    @GetMapping("/serverUrl")
    @ResponseBody
    public String serviceUrl() {
        System.out.println("url:" + ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl());
        String result = restTemplate.getForObject(ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl() + "/springcloud-eureka-provider/serverUrl/SPRINGCLOUD-EUREKA-PROVIDER",String.class);
        return result;
    }
}
