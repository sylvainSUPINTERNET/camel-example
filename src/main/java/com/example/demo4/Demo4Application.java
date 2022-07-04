package com.example.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:context-camel.xml")
public class Demo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

}
