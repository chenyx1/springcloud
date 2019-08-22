package com.chenyx.springcloud.feign.api.remote.service;

import com.chenyx.springcloud.feign.api.remote.fallback.ZkProviderHystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/***
 * @desc 获取springcloud-zk-provider-hystrix的服务，主要用于学习hystrix-dashboard
 *
 * @author chenyx
 * @date 2019-08-20
 *
 * */
@FeignClient(name = "springcloud-zk-provider-hystrix", path = "/springcloud-zk-provider-hystrix", fallbackFactory = ZkProviderHystrixFallBack.class)
public interface IZkProviderHystrixService {
    /**
     * @desc 获取服务信息
     * @auhtor chenyx
     * @date 2019-08-14
     * */
    @GetMapping("/getServer")
    public String getServer() ;

    /**
     * @desc 获取服务url
     * @auhtor chenyx
     * @date 2019-08-14
     * */
    @GetMapping("/serverUrl")
    public String serviceUrl();

}
