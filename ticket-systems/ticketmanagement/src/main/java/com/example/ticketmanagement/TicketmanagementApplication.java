package com.example.ticketmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TicketmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketmanagementApplication.class, args);
	}

}
