package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class FinalassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalassessmentApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to verizon";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greetings from verizon";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello from spring boot";
	}

}
