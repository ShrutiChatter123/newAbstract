package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.exception.DataValidException;

public interface AddressService {

	boolean validateAndSave(AddressDTO dto) throws DataValidException;

	default int getTotal() {
		return 0;

	}

	default AddressDTO findByNumber(int number) throws DataValidException {
		return null;

	}

	default boolean find(AddressDTO dto) throws DataValidException {
		return false;

	}
	
	default AddressDTO findByStreet(String street)throws DataValidException{
		return null;
		
	}
	default AddressDTO findByPincode(int pincode)throws DataValidException{
		return null;
		
	}
	default AddressDTO findByStreetAndPincodeAndArea(String street,int pincode,String Area)throws DataValidException{
		return null;
		
	}
	default AddressDTO findByCityAndState(String city,String state)throws DataValidException{
		return null;
		
	}
	default String findFloorByNumber(int number)throws DataValidException{
		return null;
		
	}
	default String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor,String street,int pincode)throws DataValidException{
		return null;
		
		
	}
	default int findPincodeByNumber(int number)throws DataValidException{
		return 0;
		
	}

}
