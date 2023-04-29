package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scissor {

	private String type;
	private double weight;
	private String colore;

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", colore=" + colore + "]";
	}

	@Value("Bandage")
	public void setType(String type) {
		this.type = type;
	}

	@Value("25.5d")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Value("Blue")
	public void setColore(String colore) {
		this.colore = colore;
	}

}
