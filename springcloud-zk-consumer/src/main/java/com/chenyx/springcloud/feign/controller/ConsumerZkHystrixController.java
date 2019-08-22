package com.chenyx.springcloud.feign.controller;

import com.chenyx.springcloud.feign.api.remote.service.IHystrixZkService;
import com.chenyx.springcloud.feign.api.remote.service.IZkProviderHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/zkHystrix")
public class ConsumerZkHystrixController {
    @Autowired
    private IZkProviderHystrixService zkProviderHystrixService;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        String result = zkProviderHystrixService.getServer();
        return  result;
    }


    @GetMapping("/serverUrl")
    @ResponseBody
    public String serviceUrl() {
        String result = zkProviderHystrixService.serviceUrl();
        return result;
    }
}
