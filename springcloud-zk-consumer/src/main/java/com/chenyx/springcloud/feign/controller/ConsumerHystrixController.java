package com.chenyx.springcloud.feign.controller;

import com.chenyx.springcloud.feign.api.remote.service.IHystrixZkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class ConsumerHystrixController {

    @Autowired
    private IHystrixZkService hystrixEurekaService;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        String result = hystrixEurekaService.getServer();
        return  result;
    }


    @GetMapping("/serverUrl")
    @ResponseBody
    public String serviceUrl() {
        String result = hystrixEurekaService.serviceUrl();
        return result;
    }
}
