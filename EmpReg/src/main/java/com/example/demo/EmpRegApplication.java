package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:application.properties"})
@SpringBootApplication
public class EmpRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRegApplication.class, args);
	}

}
