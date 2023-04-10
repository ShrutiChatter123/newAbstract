package com.xworkz.application.service;

import com.xworkz.application.dto.AwarenessDTO;
import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;

public interface AwarenessService {
	
	boolean validateAndSave(AwarenessDTO dto) throws DesertInvalidException;

	default AwarenessDTO find(AwarenessDTO dto)throws DesertInvalidException {
		return null;
	}

	default AwarenessDTO findByName(String name)throws DesertInvalidException {
		return null;

	}

	default double findAreaByName(String name)throws DesertInvalidException {
		return 0;
	}
	
	default AwarenessDTO findByNameAndCountryAndArea(String name,String country,double area)throws DesertInvalidException {
		return null;
		
	}
	
	default int total() {
		return 0;
		
	}

	
	
}
