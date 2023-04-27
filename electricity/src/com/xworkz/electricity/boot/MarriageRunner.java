package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.repository.MarriageRepositoryImp;
import com.xworkz.electricity.service.MarriageService;
import com.xworkz.electricity.service.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {
		
		MarriageDTO dto=new MarriageDTO(45, "sakshi", "kamal", false, LocalDate.of(2022, 5, 17), "ShreeBasava", 110, 18);
		
		MarriageRepository repository=new MarriageRepositoryImp();
		
		MarriageService service=new MarriageServiceImpl(repository);
		boolean ref= service.validateAndSave(dto);
		System.out.println(ref);
		
	}
}
