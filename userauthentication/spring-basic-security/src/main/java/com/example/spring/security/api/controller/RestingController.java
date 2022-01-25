package com.example.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")

public class RestingController {
	
	@GetMapping("/getMsg")
	public String greeting() {
		return "spring security";
	}

}
