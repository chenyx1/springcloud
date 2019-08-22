package com.chenyx.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "getServerFallback")
    public String getServer() {
        int a = 5/0;
        return "springcloud-eureka-provider hystrix " + discoveryClient.description();
    }

    @GetMapping("/serverUrl/{serverId}")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "serviceUrlFallback")
    public String serviceUrl(@PathVariable("serverId") String serverId) {
        List<ServiceInstance> list = discoveryClient.getInstances(serverId);
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }

    /**
     * @desc基于熔断器（hystrix）的容错处理
     * @auhtor chenyx
     * @date 2019-08-15
     *
     * */
    public String getServerFallback() {
        return  "服务不可用！";
    }


    public String serviceUrlFallback(@PathVariable("serverId") String serverId){
        return  serverId + "服务不可用！";
    }
}
