package com.chenyx.springcloud.feign.api.remote.service;

import com.chenyx.springcloud.constant.ServerConstant;
import com.chenyx.springcloud.ribbon.rule.DefineRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @desc 通过feign定义eureka-provider发现服务
 * @auhtor chenyx
 * @date 2019-08-14
 *
 * */
@FeignClient(name = "SPRINGCLOUD-EUREKA-PROVIDER",path = "/springcloud-eureka-provider")
public interface IEurekaService {

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
    @GetMapping("/serverUrl/{serverId}")
    public String serviceUrl(@PathVariable("serverId") String serverId);
}
