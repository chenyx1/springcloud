package com.chenyx.springcloud.feign.api.remote.fallback;

import com.chenyx.springcloud.feign.api.remote.service.IHystrixEurekaService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/***
 * @desc 服务降级处理 异常处理
 * @author chenyx
 * @date 2019-08-15
 *
 *
 * */
@Component
public class HyStrixFallBack implements FallbackFactory<IHystrixEurekaService>{
    @Override
    public IHystrixEurekaService create(Throwable throwable) {
        return new IHystrixEurekaService() {
            @Override
            public String getServer() {
                return "服务不可用";
            }

            @Override
            public String serviceUrl(String serverId) {
                return serverId + "服务不可用";
            }
        };
    }
}
