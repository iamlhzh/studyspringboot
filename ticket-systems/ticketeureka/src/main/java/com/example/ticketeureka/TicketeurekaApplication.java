package com.example.ticketeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TicketeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketeurekaApplication.class, args);
	}

}
