package com.example.endpoints.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
   
	@Value("${greeting-name: Mohammed}")
	private String name;
	
	@GetMapping("")
	String name() {
		return name;
	}
}