package com.cts.training.followingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FollowingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FollowingserviceApplication.class, args);
	}

}
