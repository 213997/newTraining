package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@RequestMapping("/{name}")
	public String Hello(@PathVariable String name) {
		
		return name + " Happy New Year";
	}

}
