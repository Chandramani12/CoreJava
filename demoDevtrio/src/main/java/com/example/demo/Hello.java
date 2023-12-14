package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	
	@GetMapping(path="/hello")
	public String Hello() {
		return "Hello World";
	}

}