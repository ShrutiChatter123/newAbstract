package com.xworkz.agree.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.FunDTO;

@Component
@RequestMapping("/")
public class FunController {

	public FunController() {
		System.out.println("FunControlConstructor"+getClass().getSimpleName());
	}

	@RequestMapping("/Send")
	public String onClick(FunDTO dto,Model model) {
		model.addAttribute("Executing", model.getAttribute(dto.getFName()+"Executig nameSucessfullyy..."));
	
		System.out.println("Excecuting onClick method in FunController..."+dto);
	return "/Sucess.jsp";
	}	
}

