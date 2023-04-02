
package com.xworkz.application.repositry;

import com.xworkz.application.dto.AddressDTO;

public interface AddressRepository {

	boolean save(AddressDTO dto);

	boolean isExist(AddressDTO dto);

	int total();
	
	default AddressDTO findByNumber(int number) {
		return null;
		
	}
	
	default boolean find(AddressDTO dto) {
		return false;
		
	}
	default AddressDTO findByStreet(String street) {
		return null;
		
	}
	default AddressDTO findByPincode(int pincode) {
		return null;
		
	}
	default AddressDTO findByStreetAndPincodeAndArea(String street,int pincode,String Area) {
		return null;
		
	}
	
	default AddressDTO findByCityAndState(String city,String state) {
		return null;
		
	}
	default String findFloorByNumber(int number) {
		return null;
		
	}
	default String findCityByNumberAndFloorAndStreetAndPincode(int number,String floor,String street,int pincode) {
		return null;
		
		
	}
	default int findPincodeByNumber(int number) {
		return 0;
		
	}
	
	
	
}
