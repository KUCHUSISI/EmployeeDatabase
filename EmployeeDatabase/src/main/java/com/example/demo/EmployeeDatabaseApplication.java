package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.model")   
public class EmployeeDatabaseApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(EmployeeDatabaseApplication.class, args);
	}
}
