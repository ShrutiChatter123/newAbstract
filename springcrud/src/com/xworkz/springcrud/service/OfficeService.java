package com.xworkz.springcrud.service;

import com.xworkz.springcrud.dto.OfficeDTO;

public interface OfficeService {

	boolean validateAndSave(OfficeDTO dto);
	
}
