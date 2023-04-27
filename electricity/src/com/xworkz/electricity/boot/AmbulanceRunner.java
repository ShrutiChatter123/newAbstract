package com.xworkz.electricity.boot;

import java.time.LocalDate;
import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.repository.AmbulanceRepositoryImpl;
import com.xworkz.electricity.service.AmbulanceService;
import com.xworkz.electricity.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {

		AmbulanceDTO dto = new AmbulanceDTO();

	
		AmbulanceRepository repository = new AmbulanceRepositoryImpl();

		AmbulanceService service = new AmbulanceServiceImpl(repository);
		boolean ref = service.validateAndSave(dto);
		System.out.println(ref);

	}

}
