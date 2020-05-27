package com.example.eurekatestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTestServerApplication.class, args);
	}

}
