package com.xworkz.application.dto;

public enum TypeAndWeight {
	
	IPHONE1440(40.50),SAMSUNG13 (20.54),VIVOY83(87.87);
	
	private final double weight;

	private TypeAndWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
}
