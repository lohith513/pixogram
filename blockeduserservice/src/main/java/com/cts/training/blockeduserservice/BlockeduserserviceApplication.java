package com.cts.training.blockeduserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlockeduserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockeduserserviceApplication.class, args);
	}

}
