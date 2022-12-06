package com.azure.app.service.demo.helloazure1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAzureController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> getHelloMsg() {
		return new ResponseEntity<>("Hello Azure", HttpStatus.OK);
	}

}
