package com.chenyx.springcloud.hystrix.controller;

import com.chenyx.springcloud.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private ServerConfig serverConfig;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/qryServerConfig")
    @ResponseBody
    public Object qryServerConfig() {
        return serverConfig;
    }

    @GetMapping("/getServer")
    @ResponseBody
    public String getServer() {
        return restTemplate.getForObject(serverConfig.getUrl() + "/getServer",String.class);
    }


    @GetMapping("/serviceUrl")
    @ResponseBody
    public String serviceUrl() {
        return restTemplate.getForObject(serverConfig.getUrl() + "/serviceUrl",String.class);
    }
}
