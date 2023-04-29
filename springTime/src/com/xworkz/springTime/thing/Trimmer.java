package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	@Value("menhood")
	private String brand;
	private String colore;
	private int price;
	private double height;

	@Value("red")
	public void setColore(String colore) {
		this.colore = colore;
	}

	public Trimmer(@Value("500") int price, @Value("2.3") double height) {
		super();
		this.price = price;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", colore=" + colore + ", price=" + price + ", height=" + height + "]";
	}
	
	

}
