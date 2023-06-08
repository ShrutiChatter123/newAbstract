package controller;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import constants.ApplicationConstants;
import dto.BloodDonationDTO;

@Component
@RequestMapping("/")
public class BloodController {

	public BloodController() {
		System.out.println("Running"+getClass().getSimpleName());
	}
	
	@RequestMapping("/blood")
	public String donate(@Valid  BloodDonationDTO dto,   BindingResult bindingResult,  Model model,MultipartFile file) 
			throws IOException {
		if(bindingResult.hasErrors()) {
			System.out.println("data is invalid");
			List<ObjectError> error= bindingResult.getAllErrors();
			error.forEach(e->System.out.println(e.getDefaultMessage()));
			model.addAttribute("errors", error);
			model.addAttribute("dtos", dto);
			
			
		}else {
			model.addAttribute("successMsg", dto.getDonatorName()+" form Sended sucessfuly"+dto);
			System.out.println("File recived"+file.getName());
			System.out.println("File size"+file.getSize());
			System.out.println("File Type"+file.getContentType());
			System.out.println("File bytes"+file.getBytes());
			System.out.println("data is valid"+dto);
			File physicalFile=new File( ApplicationConstants.ORIGINAL_FILE_NAME+file.getOriginalFilename());
		
			try(OutputStream os=new FileOutputStream(physicalFile)){
				os.write(file.getBytes());
			}
			

		}
		return "/Blood.jsp";
		
			
	}
	
	
	
	
	
}
