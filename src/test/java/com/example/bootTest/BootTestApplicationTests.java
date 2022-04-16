package com.example.bootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootTestApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(BootTestApplicationTests.class);
	


	@Test
	void contextLoads() {
		logger.info("Inside Test");
		assertEquals(true, true);
	}

}
