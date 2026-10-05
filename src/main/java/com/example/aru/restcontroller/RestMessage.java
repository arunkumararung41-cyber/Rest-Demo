package com.example.aru.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aru.service.ServiceMessage;

@RestController
public class RestMessage {
	
	private ServiceMessage serviceMessage;
	@Autowired
	public RestMessage(ServiceMessage serviceMessage) {
		this.serviceMessage=serviceMessage;
	}
	@GetMapping("/message")
	public String getMessage() {
		return serviceMessage.getMessage();
	}

}
