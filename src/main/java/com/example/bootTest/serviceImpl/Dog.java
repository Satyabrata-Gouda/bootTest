package com.example.bootTest.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.bootTest.service.Animal;

@Service
public class Dog implements Animal {
	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Bark";
	}

}
