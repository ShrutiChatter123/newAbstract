package com.xworkz.vehicals.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping()
public class LandingController {

	public LandingController() {
		System.out.println("LandingController:"+getClass().getSimpleName());
	}
	
	@RequestMapping("/yes")
	public String showLandingPage() {
		System.out.println("showLandingPage Excecuting sucessfully...");
		return "index.jsp";
	}
	
}
