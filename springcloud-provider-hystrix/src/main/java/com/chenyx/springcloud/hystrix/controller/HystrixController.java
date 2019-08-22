package com.chenyx.springcloud.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        return "springcloud-eureka-provider hystrix " + discoveryClient.description();
    }

    @GetMapping("/serverUrl/{serverId}")
    @ResponseBody
    public String serviceUrl(@PathVariable("serverId") String serverId) {
        List<ServiceInstance> list = discoveryClient.getInstances(serverId);
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }
}
