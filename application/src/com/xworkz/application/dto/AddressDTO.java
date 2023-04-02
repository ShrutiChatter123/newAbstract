package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddressDTO implements Serializable {

	private String street;
	private String area;
	private int pincode;
	private String floor;
	private int number;
	private String city;
	private String satate;

	public AddressDTO(String street, String area, int pincode, String floor, int number, String city, String satate) {
		super();
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.floor = floor;
		this.number = number;
		this.city = city;
		this.satate = satate;
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", pincode=" + pincode + ", floor=" + floor
				+ ", number=" + number + ", city=" + city + ", satate=" + satate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, city, floor, number, pincode, satate, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDTO other = (AddressDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(city, other.city) && floor == other.floor
				&& Objects.equals(number, other.number) && pincode == other.pincode
				&& Objects.equals(satate, other.satate) && Objects.equals(street, other.street);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSatate() {
		return satate;
	}

	public void setSatate(String satate) {
		this.satate = satate;
	}

}
