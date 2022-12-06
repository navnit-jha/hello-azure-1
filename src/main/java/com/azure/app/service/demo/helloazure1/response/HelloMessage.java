package com.azure.app.service.demo.helloazure1.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloMessage {
	
	private String message;
	private LocalDateTime timestamp;
	private String user;
}
