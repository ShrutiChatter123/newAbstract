package com.xworkz.application.repositry;

import com.xworkz.application.dto.AddressDTO;

public class AddressRepoImp implements AddressRepository {

	private AddressDTO addressDTOs[] = new AddressDTO[2];
	private int index = 0;

	// 0, 1, 2 ,3,4,

	@Override
	public boolean save(AddressDTO dto) {
		if (this.index < this.addressDTOs.length) {
			addressDTOs[index] = dto;// addressDTOs[0]=>1
			this.index++;
			System.out.println("saving is correct");
			return true;
		} else {
			System.out.println("can not store bcz memory is full");
		}
		return false;

	}

	public int total() {
		return index;
	}

	public AddressDTO findByNumber(int number) {
		for (int index = 0; index < addressDTOs.length; index++) {
			AddressDTO ref = this.addressDTOs[index];
			if (ref != null && ref.getNumber() == number) {
				System.out.println("index is exist");
				return ref;
			}

		}
		return null;

	}

	@Override
	public boolean isExist(AddressDTO dto) {
		if (index == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.out.println("DTO will check  onwords first element");
			for (int index = 0; index < addressDTOs.length; index++) {
				AddressDTO ref = addressDTOs[index];
				if (ref.equals(dto)) {
					System.out.println("index is exisit");
					return true;
				} else {
					System.out.println("index is not exisist");
				}
			}
		}

		return false;
	}

	public boolean find(AddressDTO dto) {
		for (int index = 0; index < addressDTOs.length; index++) {
			AddressDTO temp = addressDTOs[index];
			if (temp != null && dto.equals(temp)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int index = 0; index < addressDTOs.length; index++) {
			AddressDTO ref = addressDTOs[index];
			if (ref != null && ref.getStreet().equals(street)) {
				return addressDTOs[index];

			} else {
				System.out.println("street is not exist");
			}
		}
		return null;
	}

	public AddressDTO findByPinCode(int pincode) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			int ref = addressDTOs[index].getPincode();
			if (addressDTOs[index] != null && ref == pincode) {
				return addressDTOs[index];
			}
		}
		return null;
	}

	public AddressDTO findByStreetAndPinCodeAndArea(String street, int pincode, String area) {
		for (int index = 0; index < addressDTOs.length; index++) {
			String str = addressDTOs[index].getStreet();
			int pin = addressDTOs[index].getPincode();
			String ar = addressDTOs[index].getArea();
			if (addressDTOs[index] != null && street.equals(str) && pincode == pin && area.equals(ar)) {
				return addressDTOs[index];
			}
		}

		return null;

	}

	public AddressDTO findByCityAndState(String city, String state) {
		for (int index = 0; index < addressDTOs.length; index++) {
			String cit = addressDTOs[index].getCity();
			String stat = addressDTOs[index].getSatate();
			if (addressDTOs[index] != null && cit.equals(city) && stat.equals(state)) {
				return addressDTOs[index];

			}
		}
		return null;

	}

	public String findFloorByNumber(int number) {
		for (int index = 0; index < this.index; index++) {
			int i = addressDTOs[index].getNumber();
			if (addressDTOs[index] != null && number == i) {
				return addressDTOs[index].getFloor();
			}
		}
		return null;

	}

	public String findByNumberAndFloorAndStreetAndPincode(int number, String floor, String street, int pincode) {

		for (int index = 0; index < addressDTOs.length; index++) {
			int num = addressDTOs[index].getNumber();
			String flo = addressDTOs[index].getFloor();
			String s1 = addressDTOs[index].getStreet();
			int pin = addressDTOs[index].getPincode();
			if (addressDTOs[index] != null && number == num && flo.equals(flo) && street.equals(s1) && pincode == pin) {
				return addressDTOs[index].getCity();
			}
		}
		return null;

	}

	public int findPincodeByNumber(int number) {
		for (int index = 0; index < addressDTOs.length; index++) {
			int num = addressDTOs[index].getNumber();
			if (addressDTOs[index] != null && number == num) {
				int pin = addressDTOs[index].getPincode();
				return pin;
			}
		}
		return 0;
	}

}
