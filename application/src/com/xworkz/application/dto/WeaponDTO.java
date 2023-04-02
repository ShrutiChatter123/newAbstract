package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.Type;
import com.xworkz.application.constant.WeaponType;

public class WeaponDTO implements Serializable{

	private int id;
	private String name;
	private WeaponType type;
	private double cost;
	private String material;
	private String madeBy;
	private String manufacturedBy;
	private LocalDate manufactureedYear;
	private String usedBy;
	private String usedFor;
	private double weight;

	public WeaponDTO() {
		System.out.println("no-org constructor");
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

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufactureedYear() {
		return manufactureedYear;
	}

	public void setManufactureedYear(LocalDate manufactureedYear) {
		this.manufactureedYear = manufactureedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public WeaponDTO(int id, String name, WeaponType type, double cost, String material, String madeBy,
			String manufacturedBy, LocalDate manufactureedYear, String usedBy, String usedFor, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacturedBy = manufacturedBy;
		this.manufactureedYear = manufactureedYear;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeBy, manufacturedBy, manufactureedYear, material, name, type, usedBy, usedFor,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(manufactureedYear, other.manufactureedYear)
				&& Objects.equals(material, other.material) && Objects.equals(name, other.name) && type == other.type
				&& Objects.equals(usedBy, other.usedBy) && Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", \nname=" + name + ", \nWeapontype=" + type + ", \ncost=" + cost + ", \nmaterial="
				+ material + ", \nmadeBy=" + madeBy + ", \nmanufacturedBy=" + manufacturedBy + ", \nmanufactureedYear="
				+ manufactureedYear + ", \nusedBy=" + usedBy + ", \nusedFor=" + usedFor + ", \nweight=" + weight + "]";
	}

}
