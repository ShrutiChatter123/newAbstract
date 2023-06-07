package controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.InformationDTO;
import email.SendMail;

@Component
@RequestMapping("/")
public class InformationController {

	private Collection<InformationDTO> dto = new ArrayList();

	public InformationController() {
		System.out.println("InformationController:" + getClass().getSimpleName());
	}

	@PostMapping(value = "/info")
	public String click(InformationDTO dto, Model model, HttpServletRequest request) {
		model.addAttribute("msg", model.getAttribute(dto.getName() + "Sucessfully entetrd"));
		System.out.println("Exceuting click method" + dto);

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("name", request.getParameter("name"));
		httpSession.setAttribute("email", request.getParameter("email"));
		httpSession.setAttribute("country", request.getParameter("country"));
		httpSession.setAttribute("mobile", request.getParameter("mobile"));
		httpSession.setAttribute("type", request.getParameter("type"));

		SendMail.senMail(dto.getEmail(), dto.getName());

		this.dto.add(dto);
		return "/Sucess.jsp";
	}
	

	@GetMapping("/view")
	public String some(Model model) {
		model.addAttribute("list", this.dto);
		System.out.println("total list" + dto.size());
		return "/view.jsp";
	}
	

}
