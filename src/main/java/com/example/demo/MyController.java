package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	String greet() {
		return "Hello Human!";
	}
	
	@GetMapping("/delay")
	ResponseEntity<String> delay(@RequestParam int ms) throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(ms);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("");
	}
	
	@GetMapping("/long-delay")
	ResponseEntity<String> longDelay() throws InterruptedException {
		TimeUnit.SECONDS.sleep(30);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("");
	}
	
	@GetMapping("/ok")
	ResponseEntity<String> ok() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("");
	}
	
	@GetMapping("/accepted")
	ResponseEntity<String> accepted() {
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body("");
	}
	
	@GetMapping("/internal-server-error")
	ResponseEntity<String> internalServerError() {
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("");
	}
	
	@GetMapping("/not-found")
	ResponseEntity<String> notFound() {
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body("");
	}
	
	@GetMapping("/bad-request")
	ResponseEntity<String> clientError() {
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body("");
	}
	
	@GetMapping("/permanent-redirect")
	ResponseEntity<String> permanentRedirect() {
		return ResponseEntity
				.status(HttpStatus.PERMANENT_REDIRECT)
				.body("");
	}
	
	@GetMapping("/temporary-redirect")
	ResponseEntity<String> temporaryRedirect() {
		return ResponseEntity
				.status(HttpStatus.TEMPORARY_REDIRECT)
				.body("");
	}
}
