package com.xworkz.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.dto.ClientDTO;

@Component
@RequestMapping("/wel")
public class ClientController {

	private Collection<ClientDTO> colletion=new ArrayList();
	
	public ClientController() {
		System.out.println("ClientController Constructor"+getClass().getSimpleName());
	}
		
	@PostMapping
	public String click(@Valid ClientDTO dto,BindingResult bindingResult,Model model) {
		System.out.println("Excecuting click method in controller");
		
		if(bindingResult.hasErrors()) {
			System.out.println("data is invalid");

			model.addAttribute("errorMsg", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
		}else {
			model.addAttribute("msg", "Job application"+dto.getManagerName()+"is submitted sucessfully");
		}
			
		return "welcome.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/view")
	public String some(Model model) {
		model.addAttribute("list", this.colletion);
		System.out.println("total list" + colletion.size());
		return "/view.jsp";
	}
	
	
	
	
}
