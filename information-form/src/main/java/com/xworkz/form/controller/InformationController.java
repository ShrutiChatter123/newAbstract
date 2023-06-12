package com.xworkz.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.form.entity.InformationEntity;
import com.xworkz.form.service.InformationEntityService;

@Controller
@RequestMapping("/")
public class InformationController {

	@Autowired
	private InformationEntityService service;
	
	@PostMapping("/valid")
	public String onSave(InformationEntity entity) {
		boolean validateAndSave=service.validateAndSave(entity);
		if(validateAndSave) {
			return "/Information.jsp";
		}else {
			return "no entity";
		}
	}
	
	
	
}
