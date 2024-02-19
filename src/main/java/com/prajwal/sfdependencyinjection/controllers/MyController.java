package com.prajwal.sfdependencyinjection.controllers;

import com.prajwal.sfdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService){
		this.greetingService = greetingService;
	}
	public String sayHi(){
		
		return greetingService.sayGreeting();
	}
}
