package com.example.aru.Component;

import org.springframework.stereotype.Component;

@Component
public class MessageComponent {
	
	public String getMessage() {
		return "this is message from docker";
	}

}
