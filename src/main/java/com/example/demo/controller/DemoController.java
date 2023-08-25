package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String demo() {
		return "Test demo";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Test hello";
	}
	
}
