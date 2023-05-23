package com.xworkz.application.boot;


import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImp;

public class ApplicationDTORunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO=new ApplicationDTO();
		applicationDTO.setName("whatsApp");
		applicationDTO.setVersion(2.34D);
		applicationDTO.setCreatedDate(LocalDate.now());
		applicationDTO.setSize(40D);
		applicationDTO.setDevelopedBy("musk");
		applicationDTO.setType(Type.COMMERCIAL);
		applicationDTO.setPrice(4567);
		applicationDTO.setFirstVersionReleaseDate(LocalDate.of(2001, 6, 7));
		applicationDTO.setCurrentVersionReleaseDate(LocalDate.of(2023, 5, 7));
		applicationDTO.setNextVersionReleaseDate(LocalDate.of(2026, 6, 7));
		applicationDTO.setTrialDays("month");
		applicationDTO.setLangUsed(LangUsed.JAVA);
		applicationDTO.setMinProcessorSpeed(434.54D);
		applicationDTO.setMinRamSpaceRequired(100);
		applicationDTO.setInternetNeeded(true);
		applicationDTO.setAgeLimit(33);
		applicationDTO.setNoOfDownloads(55);
		applicationDTO.setRating(5);
		applicationDTO.setOsTypeSupported("realossupport,multitasking,real,mobile");
	
		System.out.println(applicationDTO);
		
		ApplicationService applicationService=new ApplicationServiceImp();
		boolean save=applicationService.validateAndSave(applicationDTO);
		System.out.println("saved:"+save);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}