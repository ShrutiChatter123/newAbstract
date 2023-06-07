package com.xworkz.ice.controller;



import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ice.dto.PassportDTO;

@Component
@RequestMapping("/")
public class PassportController {

	public PassportController() {
		System.out.println("PassportController:"+getClass().getSimpleName());
	}
	
	
	@RequestMapping("/send")
	public String add(PassportDTO dto,Model ref) {
		ref.addAttribute("sucessfully", ref.getAttribute(dto.getFName())+"name sucessfully");
		System.out.println("Excecuting add method sucessfully....."+dto);
		return "/Sucess.jsp";
	}
}
	

