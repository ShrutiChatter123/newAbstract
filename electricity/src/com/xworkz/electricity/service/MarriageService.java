package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.MarriageDTO;

public interface MarriageService {

	default boolean validateAndSave(MarriageDTO dto) {
		return false;
		
	}
}
