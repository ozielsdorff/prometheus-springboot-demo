package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	String greet() {
		return "Hello Human!";
	}
	
	//200
	@GetMapping("/ok")
	ResponseEntity<String> ok() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("");
	}
	
	//202
	@GetMapping("/accepted")
	ResponseEntity<String> accepted() {
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body("");
	}
	
	//500
	@GetMapping("/internal-server-error")
	ResponseEntity<String> internalServerError() {
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("");
	}
	
	//404
	@GetMapping("/not-found")
	ResponseEntity<String> notFound() {
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body("");
	}
	
	//400
	@GetMapping("/bad-request")
	ResponseEntity<String> clientError() {
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body("");
	}
	
	//308
	@GetMapping("/permanent-redirect")
	ResponseEntity<String> permanentRedirect() {
		return ResponseEntity
				.status(HttpStatus.PERMANENT_REDIRECT)
				.body("");
	}
	
	//307
	@GetMapping("/temporary-redirect")
	ResponseEntity<String> temporaryRedirect() {
		return ResponseEntity
				.status(HttpStatus.TEMPORARY_REDIRECT)
				.body("");
	}
}
