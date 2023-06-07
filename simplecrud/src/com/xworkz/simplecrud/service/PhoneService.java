package com.xworkz.simplecrud.service;

import com.xworkz.simplecrud.dto.PhoneDTO;

public interface PhoneService {

	boolean validateAndSave(PhoneDTO dto);
	
}
