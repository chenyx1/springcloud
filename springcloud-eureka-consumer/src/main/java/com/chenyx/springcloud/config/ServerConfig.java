package com.chenyx.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/***
 * @desc 微服务配置信息
 * @author chenyx
 * @date 2019-08-07
 *
 * */
@Component
@ConfigurationProperties("server-info") //读取外部配置文件
public class ServerConfig {

    private String ip;
    private Integer port;
    private String serverName;
    private String url;


    public ServerConfig() {
    }

    public ServerConfig(String ip, String serverName, String url) {
        this.ip = ip;
        this.serverName = serverName;
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}
