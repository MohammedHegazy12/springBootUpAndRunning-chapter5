package com.example.endpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = {"pojo"})
public class Chapter5Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter5Application.class, args);
	}

}
