package com.xworkz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.bloodDonation.service.BloodDonationService;
import com.xworkz.constants.ApplicationConstants;
import com.xworkz.dto.BloodDonationDTO;

@Component
@EnableWebMvc
@RequestMapping("/")
public class BloodController implements WebMvcConfigurer{

	Set<BloodDonationDTO> dtos=new TreeSet<>();
	
	@Autowired
	private BloodDonationService service;
	
	public BloodController() {
		System.out.println("Running"+getClass().getSimpleName());
	}
	
	
	@PostMapping("/blood")
	public String donate(@Valid  BloodDonationDTO dto,   BindingResult bindingResult,  Model model,MultipartFile file) 
			throws IOException {
//				
		
		
		if(bindingResult.hasErrors()) {
			System.out.println("data is invalid");
			List<ObjectError> error= bindingResult.getAllErrors();
			error.forEach(e->System.out.println(e.getDefaultMessage()));
			model.addAttribute("errors", error);
			model.addAttribute("dtos", dto);
			
			 
		}else {
			this.dtos.add(dto);
			System.out.println("total dtos :"+this.dtos.size());
			model.addAttribute("successMsg", dto.getDonatorName()+" form Sended sucessfuly");
			
			System.out.println("File recived"+file.getName());
			System.out.println("File size"+file.getSize());
			System.out.println("File Type"+file.getContentType());
			System.out.println("File bytes"+file.getBytes());
			System.out.println("data is valid"+dto);
	
			
//			this is for printing dto print 2o min
			service.validateAndSave(dto);
			

//			new
			
			dto.setFileName(file.getOriginalFilename()+System.currentTimeMillis());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			File physicalFile=new File( ApplicationConstants.FILE_LOCATION+dto.getFileName());

			
			
			try(OutputStream os=new FileOutputStream(physicalFile)){
				os.write(file.getBytes());
			}	
//		new add
//			this.dtos.add(dto);
//			System.out.println("Dto added to set, with total"+this.dtos.size());
//			model.addAttribute("msg","Application of"+dto.getDonatorName()+"for blood-donation is submitted sucessfully");
//			
		}
		return "/Blood.jsp";
		
	}
	
	
	
	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType,HttpServletResponse response) throws IOException {
		System.out.println("Running send image....");
		File file=new File(ApplicationConstants.FILE_LOCATION + fileName);
		response.setContentType(contentType);
		OutputStream outputStream=response.getOutputStream();
		FileInputStream in=new FileInputStream(file);
		byte [] buffer=new byte[4096];
		int length;
		while((length=in.read(buffer))>0) {
			outputStream.write(buffer, 0, length);
	}
		in.close();
		outputStream.flush();
	}
	
	
//	new
	

	@GetMapping("/list")
	public String ShowDate(Model model) {
		System.out.println("Running showDate");
		model.addAttribute("dtos", this.dtos);
		return "Display.jsp";
	
	}

	
	
	
}
	
	
	
	

