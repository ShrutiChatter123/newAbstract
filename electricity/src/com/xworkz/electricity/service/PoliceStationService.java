package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.PoliceStationDTO;

public interface PoliceStationService {

	default boolean validateAndSave(PoliceStationDTO dto) {
		return false;
	}
	
	
	
}
