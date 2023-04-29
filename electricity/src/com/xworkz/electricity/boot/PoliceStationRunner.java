package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationReository;
import com.xworkz.electricity.repository.PoliceStationRepoImpl;
import com.xworkz.electricity.service.PoliceStationService;
import com.xworkz.electricity.service.PoliceStationServiceImpl;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStationDTO dto = new PoliceStationDTO(22, "rajajinagar", "rajdeep", 21, "Banglore",LocalDate.of(1999, 5, 7));

		PoliceStationReository repository = new PoliceStationRepoImpl();

		PoliceStationService service = new PoliceStationServiceImpl(repository);
		boolean ref = service.validateAndSave(dto);
		System.out.println(ref);
	}

}
