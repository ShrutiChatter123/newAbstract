package com.xworkz.application.repositry;

import com.xworkz.application.dto.FunctionDTO;
import com.xworkz.application.exception.DesertInvalidException;

public interface FunctionRepository  {

	default boolean isExist(FunctionDTO dto) {
		return false;
	}

	boolean save(FunctionDTO dto);

	

	default FunctionDTO find(FunctionDTO dto) {
		return null;
	}
	
	default FunctionDTO findFindByName(String name) {
		return null;
		
	}
	default FunctionDTO findByNameAndLocation( String name,String location) {
		return null;
	
	}
	
	default FunctionDTO findBydateAndNameAndAreaRent(int date,String name,double AreaRent) {
		return null;
		
	}
	default  int total() {
		return 0;
	}
	

}
