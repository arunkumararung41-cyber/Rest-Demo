package com.example.aru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aru.Component.MessageComponent;

@Service
public class ServiceMessage {
	private MessageComponent messageComponent;
	@Autowired
	public ServiceMessage(MessageComponent messageComponent) {
		this.messageComponent=messageComponent;
	}
	
	public String getMessage() {
		return messageComponent.getMessage();
	}

}
