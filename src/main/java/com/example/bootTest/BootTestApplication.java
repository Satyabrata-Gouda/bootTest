package com.example.bootTest;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootTestApplication {
	public static Logger logger = LoggerFactory.getLogger(BootTestApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application startd");
	}
	public static void main(String[] args) {
		logger.info("Inside Main Method");
		SpringApplication.run(BootTestApplication.class, args);
	}

}
