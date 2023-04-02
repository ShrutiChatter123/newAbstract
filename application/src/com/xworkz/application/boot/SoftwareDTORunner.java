package com.xworkz.application.boot;

import com.xworkz.application.dto.SoftwareDTO;
import com.xworkz.application.repositry.SoftwareDTORepoImp;
import com.xworkz.application.repositry.SoftwareRepository;

public class SoftwareDTORunner {

	public static void main(String[] args) {
		
		SoftwareDTO softwareDTO=new SoftwareDTO(1, "xyze", "abcd", "abcdef");
		System.out.println("softwareDTO");
		
		
		SoftwareRepository softwareRepository=new SoftwareDTORepoImp();
		
	}
}
