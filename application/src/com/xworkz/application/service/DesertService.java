package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;

public interface DesertService {

	boolean validateAndSave(DesertDTO dto) throws DesertInvalidException;

	default DesertDTO find(DesertDTO dto)throws DesertInvalidException {
		return null;
	}

	default DesertDTO findByName(String name)throws DesertInvalidException {
		return null;

	}

	default double findAreaByName(String name)throws DesertInvalidException {
		return 0;
	}
	
	default DesertDTO findByNameAndCountryAndArea(String name,String country,double area)throws DesertInvalidException {
		return null;
		
	}
	
	default int total() {
		return 0;
		
	}

}
