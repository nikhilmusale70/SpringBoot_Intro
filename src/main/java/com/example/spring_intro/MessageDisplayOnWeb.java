package com.example.spring_intro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageDisplayOnWeb {
	@RequestMapping(value = {"", "/home"})
	public String greet() {
		return "home";
	}
}
