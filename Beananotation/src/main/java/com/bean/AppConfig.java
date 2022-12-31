package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	@Bean("hello")
	
	public Hello createHello() {
		
		System.out.println("---createHello()-----called");
		
		return new Hello();
	}
	
	

}
