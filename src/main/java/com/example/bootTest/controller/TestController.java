package com.example.bootTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootTest.service.Animal;

@RestController
public class TestController {
	
	@Autowired
//	@Qualifier("dog")
	private Animal animal;
	
//	@GetMapping
//	public String getMsg() {
//		return animal.hello();
//	}
//	
	
	@GetMapping("/msg")
	public void getMsg() {
		
		System.out.println("Hi.. welcome to Jenkins");
	}

}
