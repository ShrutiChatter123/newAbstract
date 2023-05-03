package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FoodStreat {

	private String name;
	private int cost;
	private String location;
	private String ownerName;
	private int costperFood;
	private String coockName;
	private String eaterName;
	private String menuName;
	private int NOOfFoodInMenu;
	private int noOfWorkersInShop;
	private String ownerLocation;
	private int ownerFamilyMemb;
	private String ownerEducation;
	private long coockNo;
	private long ownerNo;

	
	@Value("dabeli")
	public void setName(String name) {
		this.name = name;
	}
	@Value("47")
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Value("Banglore")
	public void setLocation(String location) {
		this.location = location;
	}

	@Value("Rajath")
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Value("34")
	public void setCostperFood(int costperFood) {
		this.costperFood = costperFood;
	}

		@Value("hamirkhan")
	public void setCoockName(String coockName) {
		this.coockName = coockName;
	}

		@Value("shruti")
	public void setEaterName(String eaterName) {
		this.eaterName = eaterName;
	}

		@Value("vishwaa hotel")
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
		
@Value("45")
	public void setNOOfFoodInMenu(int nOOfFoodInMenu) {
		NOOfFoodInMenu = nOOfFoodInMenu;
	}

	@Value("6")
	public void setNoOfWorkersInShop(int noOfWorkersInShop) {
		this.noOfWorkersInShop = noOfWorkersInShop;
	}
	
	@Value("Gadag")
	public void setOwnerLocation(String ownerLocation) {
		this.ownerLocation = ownerLocation;
	}

	@Value("8")
	public void setOwnerFamilyMemb(int ownerFamilyMemb) {
		this.ownerFamilyMemb = ownerFamilyMemb;
	}

	@Value("gradute")
	public void setOwnerEducation(String ownerEducation) {
		this.ownerEducation = ownerEducation;
	}

	@Value("3456787654")
	public void setCoockNo(long coockNo) {
		this.coockNo = coockNo;
	}

	@Value("987667346")
	public void setOwnerNo(long ownerNo) {
		this.ownerNo = ownerNo;
	}
	@Override
	public String toString() {
		return "FoodStreat [name=" + name + ", cost=" + cost + ", location=" + location + ", ownerName=" + ownerName
				+ ", costperFood=" + costperFood + ", coockName=" + coockName + ", eaterName=" + eaterName
				+ ", menuName=" + menuName + ", NOOfFoodInMenu=" + NOOfFoodInMenu + ", noOfWorkersInShop="
				+ noOfWorkersInShop + ", ownerLocation=" + ownerLocation + ", ownerFamilyMemb=" + ownerFamilyMemb
				+ ", ownerEducation=" + ownerEducation + ", coockNo=" + coockNo + ", ownerNo=" + ownerNo + "]";
	}
	
	public String foodMel() {
		System.out.println("calling foodMale");
		return "snacks type";
	}
	
	

}
