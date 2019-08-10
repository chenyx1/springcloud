package com.chenyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringcloudEurekaServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServer01Application.class, args);
	}

}
