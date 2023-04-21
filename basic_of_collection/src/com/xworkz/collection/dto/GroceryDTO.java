package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class GroceryDTO implements Serializable,Comparable<GroceryDTO> {

	private int id;
	private String name;
	private int price;
	private double quantity;

	@Override
	public String toString() {
		return "GroceryDTO [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public GroceryDTO(int id, String name, int price, double quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		System.out.println("CAlling hashcode...this is fixed code..");
		return Objects.hash(id,name,price,quantity);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && price == other.price
				&& Double.doubleToLongBits(quantity) == Double.doubleToLongBits(other.quantity);
	}
	
	@Override
	public int compareTo(GroceryDTO o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	

}
