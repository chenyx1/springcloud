package com.chenyx.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZkController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {

        return "springcloud-zk-provider  " + discoveryClient.description();
    }

    @GetMapping("/serverUrl")
    @ResponseBody
    public List<String> serviceUrl() {
        List<String> list = discoveryClient.getServices();
        return list;
    }
}
