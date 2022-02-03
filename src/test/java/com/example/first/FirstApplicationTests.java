package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class FirstApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping("/")

	public String index() {
		return "Kalmyrza";
	}
}
