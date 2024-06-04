package com.Eureka.serverProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProjectApplication.class, args);
	}

}
