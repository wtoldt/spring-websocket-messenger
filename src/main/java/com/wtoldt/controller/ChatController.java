package com.wtoldt.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.wtoldt.domain.Message;



@Controller
public class ChatController {

	@MessageMapping("/messages")
	@SendTo("/messages")
	public Message message(Message message) throws Exception {
	    return message;
	}

}
