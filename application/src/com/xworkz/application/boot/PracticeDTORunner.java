package com.xworkz.application.boot;

import com.xworkz.application.dto.PracticeDTO;
import com.xworkz.application.repositry.PracticeDTORepoImp;
import com.xworkz.application.repositry.PracticeRepository;

public class PracticeDTORunner {

	public static void main(String[] args) {

		PracticeDTO practiceDTO=new PracticeDTO(4, "crud", "xworkz");
		System.out.println("DTO in runner");
		
		PracticeRepository repo=new PracticeDTORepoImp();
	}

}
