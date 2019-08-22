package com.chenyx.springcloud.feign.api.remote.fallback;

import com.chenyx.springcloud.feign.api.remote.service.IHystrixZkService;
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
public class HyStrixFallBack implements FallbackFactory<IHystrixZkService>{
    @Override
    public IHystrixZkService create(Throwable throwable) {
        return new IHystrixZkService() {
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
