package com.chenyx.springcloud.feign.api.remote.fallback;

import com.chenyx.springcloud.feign.api.remote.service.IZkProviderHystrixService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/***
 * @desc hystrix 服务降级返回的fallback
 * @auhtor chenyx
 * @date 2019-08-20
 *
 * */
@Component
public class ZkProviderHystrixFallBack implements FallbackFactory<IZkProviderHystrixService> {
    @Override
    public IZkProviderHystrixService create(Throwable throwable) {
        return new IZkProviderHystrixService() {
            @Override
            public String getServer() {
                return " getServer 服务不可用";
            }

            @Override
            public String serviceUrl() {
                return " serviceUrl 服务不可用";
            }
        };
    }
}
