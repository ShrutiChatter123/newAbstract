package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.DataValidException;
import com.xworkz.application.repositry.AddressRepository;
import com.xworkz.application.repositry.ApplicationRepositry;
import com.xworkz.application.utility.AddressUtil;

public class AddressServiceImp implements AddressService {

	private AddressRepository repo;

	public AddressServiceImp(AddressRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(AddressDTO dto) throws DataValidException {
		System.out.println("Dto is not invalid now initializing method");

		
		
		if (dto != null) {
			System.out.println("dto is not valid");

			String street = dto.getStreet();
			String area = dto.getArea();
			int pincode = dto.getPincode();
			String floor = dto.getFloor();
			int number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getSatate();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			String Street = dto.getStreet();
			if (AddressUtil.validString(Street)) {
				validStreet = true;
				System.out.println("street is valid");
			} else {
				System.out.println("street invalid");
			}
			String Area = dto.getArea();
			if (AddressUtil.validString(Area)) {
				validArea = true;
				System.out.println("area is valid");
			} else {
				System.out.println("area invalid");
			}

			int Pincode = dto.getPincode();
			if (AddressUtil.validint(Pincode)) {
				validPincode = true;
				System.out.println("pincode is valid");
			} else {
				System.out.println("pincode invalid");
			}

			String Floor = dto.getFloor();
			if (AddressUtil.validString(Floor)) {
				validFloor = true;
				System.out.println("floor is valid");
			} else {
				System.out.println("floor invalid");
			}

			int Number = dto.getNumber();
			if (AddressUtil.validint(Number)) {
				validNumber = true;
				System.out.println("number valid");
			} else {
				System.out.println("number invalid");
			}

			String City = dto.getCity();
			if (AddressUtil.validString(City)) {
				validCity = true;
				System.out.println("city is valid");
			} else {
				System.out.println("city invalid");
			}

			String State = dto.getSatate();
			if (AddressUtil.validString(State)) {
				validState = true;
				System.out.println("state is valid");
			} else {
				System.out.println("state invalid");

			}
		}
		if (AddressUtil.validFlags(validStreet, validArea, validPincode, validFloor, validNumber, validCity)) {
			
			boolean temp=repo.save(dto);
			if(temp) {
				return true;
			}else {
				return false;
			}
		}
	}

	public int total() {
		return repo.total();
	}

	public AddressDTO findByNumber(int number) throws DataValidException {
		if(AddressUtil.validint(number)) {
			AddressDTO dto=repo.findByNumber(number);
			return dto;
		}
		throw new DataValidException("data validation exception by findVBynumber");
		
	}
	public boolean find(AddressDTO dto) throws DataValidException {
		if(dto!=null) {
			if(repo.find(dto)) {
				return true;
			}
		}
		throw new DataValidException("data validation exception: passing null DTO ");
		
	}
	
	public AddressDTO findByStreet(String street) throws DataValidException {
		if(AddressUtil.validString(street)) {
			AddressDTO dto=repo.findByStreet(street);
			return dto;
		}
		throw new DataValidException("data validation exception:passing null DTO");
		
	}
	
	public AddressDTO findByPincode(int pincode) throws DataValidException {
		if(AddressUtil.validint(pincode)) {
			AddressDTO dto=repo.findByPincode(pincode);
			return dto;
		}
		throw new DataValidException("data validation in exception:passing dto");
		
	}
	
	public AddressDTO findByStreetAndPincodeAndArea(int pincode,String area,String street) throws DataValidException {
		if(AddressUtil.validString(street)&&AddressUtil.validint(pincode)&& AddressUtil.validString(street)) {
			AddressDTO dto=repo.findByStreetAndPincodeAndArea(street, pincode, area);
			return dto;
		}
		throw new DataValidException("data validation in exception : passing strreet pincode area");
		
	}
	
	 public AddressDTO findByCityAndState(String city,String state) throws DataValidException {
		 if(AddressUtil.validString(state)&& AddressUtil.validString(state)) {
			 AddressDTO dto=repo.findByCityAndState(city, state);
			 return dto;
		 }
	throw new DataValidException("data validation in exception : passing city statae");
		 
	 }
	 
	 public String findFloorByNumber(int number)throws DataValidException {
		 if(AddressUtil.validint(number)) {
			 String floor=repo.findFloorByNumber(number);
			 return floor;
		 }
		 throw new DataValidException("data validation in exception:passing floor ");
	 }
	 
	 public String findCityByNumberAndFloorAndStreetAndPincode(int number,String floor,String street,int pincode) throws DataValidException {
		if(AddressUtil.validint(pincode)&& AddressUtil.validString(street)&& AddressUtil.validString(street)&& AddressUtil.validint(pincode)) {
			String dto=repo.findCityByNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
			return dto;
		}
		 
		 throw new DataValidException("data validation in exception: city");
		 
	 }
	 
	 public int findPincodeByNumber(int number) throws DataValidException {
		 if(AddressUtil.validint(number)) {
			 int pin=repo.findPincodeByNumber(number);
			 return pin;
		 }
		throw new DataValidException("data validating in exception:passing invalid number");
		 
	 }

}
