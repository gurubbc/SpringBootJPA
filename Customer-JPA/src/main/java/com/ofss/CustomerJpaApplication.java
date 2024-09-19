package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerJpaApplication.class, args);
		System.out.println("Customer API with JPA started...!!!");
	}

}
