package com.xworkz.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping()
public class CoffieControler {

	public CoffieControler() {
		System.out.println(" Running in class:"+ this.getClass().getSimpleName());	
	}
	
	@RequestMapping("/send")
	 public String onclick(){
		System.out.println("Excecuting onclick method in class...");
		return "/index.jsp";
	} 
	

}
