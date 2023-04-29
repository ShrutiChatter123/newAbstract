package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {

	private double height;
	private String shape;
	@Value("200")
	private double weight;

	public Mirror(@Value("2.3d") double height) {
		super();
		this.height = height;
	}

	@Value("Round")
	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Mirror [height=" + height + ", shape=" + shape + ", weight=" + weight + "]";
	}

	
}
