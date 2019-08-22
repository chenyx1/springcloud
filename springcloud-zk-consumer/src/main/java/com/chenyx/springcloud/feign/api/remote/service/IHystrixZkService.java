package com.chenyx.springcloud.feign.api.remote.service;

import com.chenyx.springcloud.feign.api.remote.fallback.HyStrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/***
 * @desc 通过feign定义eureka-provider发现服务
 *        hystrix服务降级
 * @auhtor chenyx
 * @date 2019-08-14
 *
 * */
@FeignClient(name = "springcloud-zk-provider",path = "/springcloud-zk-provider",fallbackFactory = HyStrixFallBack.class)
public interface IHystrixZkService {

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
