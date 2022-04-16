package com.example.bootTest.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.bootTest.service.Animal;

@Service
@Primary
public class Cat implements Animal {

	@Override
	public String hello() {

		return "MewwooM";
	}
	
	

}
