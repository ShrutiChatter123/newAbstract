package com.xworkz.adhar_card.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.tomcat.jni.Error;
import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.adhar_card.dto.AdharDTO;


@Component
@RequestMapping("/")
public class AdharController {

	private Collection<AdharDTO> dtos=new ArrayList<>();
	
	public AdharController() {
		System.out.println("Excecuting"+getClass().getSimpleName());
	}
	
	@PostMapping("/happy")
	public String adhar(AdharDTO dto, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			System.out.println("Saving is invalid");
			model.addAttribute("errorMsg", bindingResult.getAllErrors());
//			or List<ObjectError>error=bindingResult.getAllErrors();
//			or error.forEach(s->System.out.println(s.getDefaultMessage()));
//			or model.addAttribute("errors", error);
			model.addAttribute("dtos", dto);
		}else {
//			this.dtos.add(dto);
			
			
			System.out.println("total dtos :"+this.dtos.size());
			model.addAttribute("msg", dto.getFName()+  " form field send sucessfully");
			
		}
		
		
		
		System.out.println("adhar method running sucessfully "+dto);
		return "/Adhar.jsp";
	}
	
	
	
	
	
	
}
