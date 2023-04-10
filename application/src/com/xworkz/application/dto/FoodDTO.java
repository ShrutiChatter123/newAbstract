package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class FoodDTO implements Serializable {

	private String name;
	private int cost;
	private String location;
	private double shopGstNo;
	private String buyerName;
	
	
	
	public FoodDTO(String name, int cost, String location, double shopGstNo, String buyerName) {
		super();
		this.name = name;
		this.cost = cost;
		this.location = location;
		this.shopGstNo = shopGstNo;
		this.buyerName = buyerName;
	}



	@Override
	public String toString() {
		return "FoodDTO [name=" + name + ", cost=" + cost + ", location=" + location + ", shopGstNo=" + shopGstNo
				+ ", buyerName=" + buyerName + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(buyerName, cost, location, name, shopGstNo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodDTO other = (FoodDTO) obj;
		return Objects.equals(buyerName, other.buyerName) && cost == other.cost
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(shopGstNo, other.shopGstNo);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public double getShopGstNo() {
		return shopGstNo;
	}



	public void setShopGstNo(double shopGstNo) {
		this.shopGstNo = shopGstNo;
	}



	public String getBuyerName() {
		return buyerName;
	}



	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	
	
	
	
	
}
