package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {

	private String brand;
	private String type;
	@Value("Black")
	private String colore;
	@Value("250.33")
	private double Weight;
	private String rpm;

	public HairDryer(@Value("lony") String brand, @Value("wireless") String type) {
		super();
		this.brand = brand;
		this.type = type;
	}

	@Value("thousands")
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", colore=" + colore + ", Weight=" + Weight + ", rpm="
				+ rpm + "]";
	}
	
	

}
