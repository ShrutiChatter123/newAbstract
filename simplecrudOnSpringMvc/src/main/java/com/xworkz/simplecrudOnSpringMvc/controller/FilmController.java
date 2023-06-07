package com.xworkz.simplecrudOnSpringMvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.simplecrudOnSpringMvc.dto.FilmDTO;

@Component
@RequestMapping("/")
public class FilmController {

	public FilmController() {
		System.out.println("film:"+getClass().getSimpleName());
	}
	
	@RequestMapping("/send")
	public String click(FilmDTO dto,Model model) {
		model.addAttribute("SucessFull enterinrd", model.getAttribute(dto.getFilmName())+"Enterd Sucessfully");
		System.out.println("Excecuting methods"+dto);
		return"/Film.jsp";
	}
}
