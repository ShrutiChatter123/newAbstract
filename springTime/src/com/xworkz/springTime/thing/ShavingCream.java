package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {
	
	private String brand;
	@Value("50")
	private int price;
	@Value("Very Good")
	private String quality;

	public ShavingCream(@Value("Gillete")String brand) {
		super();
		this.brand = brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quality=" + quality + "]";
	}


	
}
