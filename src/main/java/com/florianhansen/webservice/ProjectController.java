package com.florianhansen.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
}
