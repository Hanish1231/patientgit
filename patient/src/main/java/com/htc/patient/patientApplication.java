package com.htc.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class patientApplication {

	public static void main(String[] args) {
		SpringApplication.run(patientApplication.class, args);
	}

}
