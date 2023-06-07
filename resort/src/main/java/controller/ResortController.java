package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.ResortDTO;
import email.SendMail;

@Component
@RequestMapping("/")
public class ResortController {

	private Collection<ResortDTO> collection = new ArrayList<>();

	public ResortController() {
		System.out.println("ResortController:" + getClass().getSimpleName());
	}

	@PostMapping( value = "/Send")
	public String click(ResortDTO dto, Model model, HttpServletRequest request) {
		model.addAttribute("mesg", model.getAttribute(dto.getOwnerName() + "Sucessfully sended"));
		System.out.println("Excecuting click method siucessfully....." + dto);

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("resortName", request.getParameter("resortName"));
		httpSession.setAttribute("ownerName", request.getParameter("ownerName"));
		httpSession.setAttribute("location", request.getParameter("location"));
		httpSession.setAttribute("mobileNo", request.getParameter("mobileNo"));
		httpSession.setAttribute("email", request.getParameter("email"));
		httpSession.setAttribute("roomType", request.getParameter("roomType"));
		httpSession.setAttribute("priceRange", request.getParameter("priceRange"));
		httpSession.setAttribute("foodType", request.getParameter("foodType"));
		httpSession.setAttribute("swimingFoolAcess", request.getParameter("swimingFoolAcess"));

		
		SendMail.senMail(dto.getEmail(), dto.getOwnerName());

		
		this.collection.add(dto);
		return "/print.jsp";
	}
	@PostMapping("/view")
	public String collection(Model model) {
		model.addAttribute("list", this.collection);
		System.out.println("Total list" +  collection.size());
		return "/View.jsp";
	}
	
	
	
	

}
