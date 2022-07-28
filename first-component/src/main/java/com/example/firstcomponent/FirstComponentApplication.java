package com.example.firstcomponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstComponentApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(FirstComponentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstComponentApplication.class, args);

		for (int i = 0; i < 10; i++) {
			LOGGER.info("This is small test, image testing. Iteration: {}", i);
		}
	}

}
