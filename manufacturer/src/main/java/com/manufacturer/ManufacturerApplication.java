package com.manufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManufacturerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufacturerApplication.class, args);
	}

}
