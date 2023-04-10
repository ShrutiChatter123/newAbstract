package com.xworkz.application.service;

import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.EventValidException;

public interface EventService {
	
boolean validatAndSave(EventDTO dto)throws EventValidException;
	
	default EventDTO find(EventDTO dto)throws EventValidException {
		return null;
	}

	
	default EventDTO findFindByName(String name)throws EventValidException {
		return null;
		
	}
	default EventDTO findByNameAndLocation( String name,String location)throws EventValidException {
		return null;
		
	}
	
	default EventDTO findByNameAndLocationAnddateAndfamilymemeber(String name,String location,int date,int familymemeber)throws DesertInvalidException {
		return null;
		
	}
	
	
	
	default EventDTO findByNameOrlocationOrhallCost(String name, String location,double hallCost)throws EventValidException {
		return null;
		
	}

	
}
