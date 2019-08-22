package com.chenyx.springcloud.feign.controller;

import com.chenyx.springcloud.constant.ServerConstant;
import com.chenyx.springcloud.feign.api.remote.service.IEurekaService;
import com.chenyx.springcloud.feign.api.remote.service.IHystrixEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class ConsumerHystrixController {

    @Autowired
    private IHystrixEurekaService hystrixEurekaService;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        String result = hystrixEurekaService.getServer();
        return  result;
    }


    @GetMapping("/serverUrl")
    @ResponseBody
    public String serviceUrl() {
        String result = hystrixEurekaService.serviceUrl("SPRINGCLOUD-EUREKA-PROVIDER-HYSTRIX");
        return result;
    }
}
