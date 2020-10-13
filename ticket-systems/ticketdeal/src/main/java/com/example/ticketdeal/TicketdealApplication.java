package com.example.ticketdeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TicketdealApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketdealApplication.class, args);
	}

}
