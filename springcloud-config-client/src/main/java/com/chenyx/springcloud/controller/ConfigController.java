package com.chenyx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {


    @Value("${spring.application.name}")
    private String serverName;

    @Value("${server.port}")
    private String port;

    @Value("${config-client.name}")
    private String configCilentName;

    @Value("${config-client.port}")
    private String configPort;

    @RequestMapping("/getServerInfo")
    @ResponseBody
    public String getServerInfo() {
        String serverInfo = "serverName:" + serverName + ",port:"+ port;
        System.out.println(serverInfo);
        return  serverInfo;
    }

    @RequestMapping("/getConfigServerInfo")
    @ResponseBody
    public String getConfigServerInfo() {
        String serverInfo = "configCilentName:" + configCilentName + ",configPort:"+ configPort;
        System.out.println(serverInfo);
        return  serverInfo;
    }
}
