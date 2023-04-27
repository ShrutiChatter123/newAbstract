package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.DataValidException;
import com.xworkz.application.repositry.AddressRepository;
import com.xworkz.application.repositry.ApplicationRepositry;
import static com.xworkz.application.utility.AddressUtil.*;

import javax.xml.validation.Validator;

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
			if (validString(Street)) {
				validStreet = true;
				System.out.println("street is valid");
			} else {
				System.out.println("street invalid");
			}
			String Area = dto.getArea();
			if (validString(Area)) {
				validArea = true;
				System.out.println("area is valid");
			} else {
				System.out.println("area invalid");
			}

			int Pincode = dto.getPincode();
			if (validint(Pincode)) {
				validPincode = true;
				System.out.println("pincode is valid");
			} else {
				System.out.println("pincode invalid");
			}

			String Floor = dto.getFloor();
			if (validString(Floor)) {
				validFloor = true;
				System.out.println("floor is valid");
			} else {
				System.out.println("floor invalid");
			}

			int Number = dto.getNumber();
			if (validint(Number)) {
				validNumber = true;
				System.out.println("number valid");
			} else {
				System.out.println("number invalid");
			}

			String City = dto.getCity();
			if (validString(City)) {
				validCity = true;
				System.out.println("city is valid");
			} else {
				System.out.println("city invalid");
			}

			String State = dto.getSatate();
			if (validString(State)) {
				validState = true;
				System.out.println("state is valid");
			} else {
				System.out.println("state invalid");

			}
		
		if (validFlags(validStreet,validArea,validPincode,validFloor,validNumber,validCity,validState)) {
			
			boolean temp=repo.save(dto);
			if(temp) {
				return true;
			}else {
				return false;
			}
		}
		}
		return false;
	}

	public int total() {
		return repo.total();
	}

	public AddressDTO findByNumber(int number) throws DataValidException {
		if(validint(number)) {
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
		if(validString(street)) {
			AddressDTO dto=repo.findByStreet(street);
			return dto;
		}
		throw new DataValidException("data validation exception:passing null DTO");
		
	}
	
	public AddressDTO findByPincode(int pincode) throws DataValidException {
		if(validint(pincode)) {
			AddressDTO dto=repo.findByPincode(pincode);
			return dto;
		}
		throw new DataValidException("data validation in exception:passing dto");
		
	}
	
	public AddressDTO findByStreetAndPincodeAndArea(int pincode,String area,String street) throws DataValidException {
		if(validString(street)&&validint(pincode)&& validString(street)) {
			AddressDTO dto=repo.findByStreetAndPincodeAndArea(street, pincode, area);
			return dto;
		}
		throw new DataValidException("data validation in exception : passing strreet pincode area");
		
	}
	
	 public AddressDTO findByCityAndState(String city,String state) throws DataValidException {
		 if(validString(state)&& validString(state)) {
			 AddressDTO dto=repo.findByCityAndState(city, state);
			 return dto;
		 }
	throw new DataValidException("data validation in exception : passing city statae");
		 
	 }
	 
	 public String findFloorByNumber(int number)throws DataValidException {
		 if(validint(number)) {
			 String floor=repo.findFloorByNumber(number);
			 return floor;
		 }
		 throw new DataValidException("data validation in exception:passing floor ");
	 }
	 
	 public String findCityByNumberAndFloorAndStreetAndPincode(int number,String floor,String street,int pincode) throws DataValidException {
		if(validint(pincode)&& validString(street)&& validString(street)&& validint(pincode)) {
			String dto=repo.findCityByNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
			return dto;
		}
		 
		 throw new DataValidException("data validation in exception: city");
		 
	 }
	 
	 public int findPincodeByNumber(int number) throws DataValidException {
		 if(validint(number)) {
			 int pin=repo.findPincodeByNumber(number);
			 return pin;
		 }
		throw new DataValidException("data validating in exception:passing invalid number");
		 
	 }

}
