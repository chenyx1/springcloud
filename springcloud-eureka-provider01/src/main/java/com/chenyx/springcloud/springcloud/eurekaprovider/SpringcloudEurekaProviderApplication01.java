package com.chenyx.springcloud.springcloud.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaProviderApplication01 {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaProviderApplication01.class, args);

	}

}
