package com.example.first;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class FirstApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping("/")

	public String index() {
		return "Hello World";
	}
}
