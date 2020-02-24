package com.cts.training.actionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ActionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionserviceApplication.class, args);
	}

}
