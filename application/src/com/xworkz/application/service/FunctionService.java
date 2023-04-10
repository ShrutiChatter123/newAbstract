package com.xworkz.application.service;

import com.xworkz.application.dto.FunctionDTO;
import com.xworkz.application.exception.DesertInvalidException;

public interface FunctionService {
	
	boolean validatAndSave(FunctionDTO dto)throws DesertInvalidException;
	
	default FunctionDTO find(FunctionDTO dto)throws DesertInvalidException {
		return null;
	}
	
	default FunctionDTO findFindByName(String name)throws DesertInvalidException {
		return null;
		
	}
	default FunctionDTO findByNameAndLocation( String name,String location)throws DesertInvalidException {
		return null;
		
	}
	
	default FunctionDTO findBydateAndNameAndfamilymemeber(int date,String name,double AreaRent)throws DesertInvalidException {
		return null;
		
	}
	
	

}
