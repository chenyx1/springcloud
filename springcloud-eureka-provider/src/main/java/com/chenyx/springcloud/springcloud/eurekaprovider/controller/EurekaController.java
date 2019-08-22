package com.chenyx.springcloud.springcloud.eurekaprovider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EurekaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {

        return "springcloud-eureka-provider  " + discoveryClient.description();
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
