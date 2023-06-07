package com.xworkz.cricket.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class CaptainController {

	public CaptainController(){
		System.out.println("CaptainController:" + getClass().getSimpleName());
	}

	@RequestMapping(value="/send")
	public String okClick() {
		System.out.println("Calling okClick method sucessfully in controller");
		return "/Display.jsp";
		
	}

}
