package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BloodDonationDTO;

@Component
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		System.out.println("Running:"+getClass().getSimpleName());
	}
	
	@RequestMapping("/default")
	public String control(Model model) {
		System.out.println("Running  controle in DefaultController class ");
		model.addAttribute("dtos", new BloodDonationDTO());
	return "Blood.jsp";
	
	}
	
	
	
}
