package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingDockerApplication.class, args);
		System.out.println("(Application is Runing.......)");
	}

}
