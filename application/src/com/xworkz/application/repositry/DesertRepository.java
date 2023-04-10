package com.xworkz.application.repositry;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.dto.DesertDTO;

public interface DesertRepository {

	default boolean isExist(DesertDTO dto) {
		return false;
	}

	boolean save(DesertDTO dto);

	default DesertDTO find(DesertDTO dto) {
		return dto;
		
	}
	
	default DesertDTO finByName(String name) {
		return null;
	}
	
	default double findAreaByName(String name) {
		return 0;
		
	}
	
	default DesertDTO findByNameAndCountryAndArea(String name,String country,double area) {
		return null;
		
	}
	
	default int total() {
		return 0;
		
	}
	
}
	

