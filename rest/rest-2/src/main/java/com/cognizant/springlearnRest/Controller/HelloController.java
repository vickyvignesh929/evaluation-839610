package com.cognizant.springlearnRest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path="/hello")
	public String sayHello()
	{
		return "Hello World!!";
	}
}
