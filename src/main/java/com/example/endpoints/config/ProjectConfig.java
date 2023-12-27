package com.example.endpoints.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.endpoints.pojo.Droid;

@Configuration
public class ProjectConfig {
	@Bean
	@ConfigurationProperties(prefix="droid")
	public Droid createDroid() {
		return new Droid();
	}
}
