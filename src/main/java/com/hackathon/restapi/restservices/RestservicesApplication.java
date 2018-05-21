package com.hackathon.restapi.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.hackathon.restapi.restservices"})
public class RestservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestservicesApplication.class, args);
	}
}
