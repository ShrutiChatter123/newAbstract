package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	
	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;
	
	public Saloon(@Value("rajath")String name,@Value("hariyanth") String ownerName,@Value("womens") String type,@Value("banglore") String location,@Value("12") int noOfBarbers) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}
	
	
	

	
	
	
	
	
	
	

}
