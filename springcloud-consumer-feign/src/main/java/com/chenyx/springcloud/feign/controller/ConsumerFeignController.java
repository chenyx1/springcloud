package com.chenyx.springcloud.feign.controller;

import com.chenyx.springcloud.constant.ServerConstant;
import com.chenyx.springcloud.feign.api.remote.service.IEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {
    @Autowired
    private IEurekaService eurekaService;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        System.out.println("url:" + ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl());
        String result = eurekaService.getServer();
        return  result;
    }


    @GetMapping("/serverUrl")
    @ResponseBody
    public String serviceUrl() {
        System.out.println("url:" + ServerConstant.SPRINGCLOUD_EUREKA_PROVIDER.getServerUrl());
        String result = eurekaService.serviceUrl("SPRINGCLOUD-EUREKA-PROVIDER");
        return result;
    }
}
