package com.grabski.eurekaserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApiApplication.class, args);
	}

}
