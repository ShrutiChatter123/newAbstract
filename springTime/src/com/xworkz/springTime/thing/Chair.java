package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {

	@Value("Lgtht white")
	private String colore;
	
	@Value("narrow round")
	private String shape;
	public void setShape(String shape) {
		this.shape = shape;
	}
	 @Value("Costly")
	private String type;
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Chair [colore=" + colore + ", shape=" + shape + ", type=" + type + "]";
	}
	
	
}
