package com.chenyx.springcloud.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @desc dashboard 配置
 * @author chenyx
 * @date 2019-08-19
 *
 * */
@Configuration
public class DashBoardConfig {

    /***
     * @desc 配置dashboard 的ServletRegistrationBean
     * @auhtor chenyx
     * @date 2019-08-19
     *
     * */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setServlet(new HystrixMetricsStreamServlet());
        return servletRegistrationBean;
    }
}
