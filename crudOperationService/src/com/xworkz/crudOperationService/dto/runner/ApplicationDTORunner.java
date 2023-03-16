package com.xworkz.crudOperationService.dto.runner;

import java.time.LocalDate;

import com.xworkz.crudOperationService.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO=new ApplicationDTO();
		applicationDTO.setName("whatsApp");
		applicationDTO.setVersion(2.34D);
		applicationDTO.setCreatedDate(LocalDate.now());
		applicationDTO.setSize(40D);
		applicationDTO.setDevelopedBy("musk");
		applicationDTO.setType("socialmedia");
		applicationDTO.setPrice(4567);
		applicationDTO.setFirstVersionReleaseDate(LocalDate.of(2001, 6, 7));
		applicationDTO.setCurrentVersionReleaseDate(LocalDate.of(2023, 5, 7));
		applicationDTO.setNextVersionReleaseDate(LocalDate.of(2026, 6, 7));
		applicationDTO.setTrialDays("month");
		applicationDTO.setLangUsed("java,phython,web");
		applicationDTO.setMinProcessorSpeed(434.54D);
		applicationDTO.setMinRamSpaceRequired(100);
		applicationDTO.setAgeLimit(33);
		applicationDTO.setNoOfDownloads(55);
		applicationDTO.setRating(5);
		applicationDTO.setOsTypeSupported("realossupport,multitasking,real,mobile");
	
	}

}
