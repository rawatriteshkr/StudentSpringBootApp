package com.nttdata.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World by RequestMethod.GET";
	}

}
