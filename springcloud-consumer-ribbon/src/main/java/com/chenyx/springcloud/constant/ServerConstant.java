package com.chenyx.springcloud.constant;

/**
 * @desc 用于定义微服务常量
 * @author chenyx
 * @date 2019-08-12
 *
 * */
public enum ServerConstant {
    SPRINGCLOUD_EUREKA_PROVIDER("springcloud-eureka-provider","http://SPRINGCLOUD-EUREKA-PROVIDER");

    private String serverName;
    private String serverUrl;

    ServerConstant(String serverName, String serverUrl) {
        this.serverName = serverName;
        this.serverUrl = serverUrl;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerUrl() {
        return serverUrl;
    }
}
