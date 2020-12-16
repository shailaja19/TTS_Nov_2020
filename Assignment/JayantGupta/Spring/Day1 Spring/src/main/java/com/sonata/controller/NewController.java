package com.sonata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	
	@RequestMapping("/hello1")
	public String sayHi() {
		return " I am Jayant";
	}
}
