package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HealthyController {

	public HealthyController() {
	System.out.println("HealthyController:"+getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/send")
	public String onClick() {
		System.out.println("Calling onClick method in Controller... ");	
		return "/index.jsp";
		
	}
	
	
}
