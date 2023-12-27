package com.example.endpoints.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.endpoints.pojo.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
   
	private final Greeting greeting;
	
	public GreetingController(Greeting greeting) {
		super();
		this.greeting = greeting;
	}
	@GetMapping("")
	String name() {
		return greeting.getName();
	}
	@GetMapping("/coffee")
	String getNameAndCoffe() {
		return greeting.getCoffee();
	}
}
