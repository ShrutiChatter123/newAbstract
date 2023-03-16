package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class HeadphoneDTO {

	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Colore colore;
	private TypeAndWeight TypeAndWeight;
	private String customerName;
	private int invoiveNo;
	private LocalDate mfgDate;
	private int warrantyPeriod;
	
	public HeadphoneDTO() {
		System.out.println("no-org constructor");
	}

	public HeadphoneDTO(Brand brand, String modelNo, double price, boolean bass, Colore colore,
			com.xworkz.application.dto.TypeAndWeight typeAndWeight, String customerName, int invoiceNo,
			LocalDate mfgDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.colore = colore;
		TypeAndWeight = typeAndWeight;
		this.customerName = customerName;
		this.invoiveNo = invoiceNo;
		this.mfgDate = mfgDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TypeAndWeight, bass, brand, colore, customerName, invoiveNo, mfgDate, modelNo, price,
				warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadphoneDTO other = (HeadphoneDTO) obj;
		return TypeAndWeight == other.TypeAndWeight && bass == other.bass && brand == other.brand
				&& colore == other.colore && Objects.equals(customerName, other.customerName)
				&& invoiveNo == other.invoiveNo && Objects.equals(mfgDate, other.mfgDate)
				&& Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& warrantyPeriod == other.warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public TypeAndWeight getTypeAndWeight() {
		return TypeAndWeight;
	}

	public void setTypeAndWeight(TypeAndWeight typeAndWeight) {
		TypeAndWeight = typeAndWeight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiveNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiveNo = invoiceNo;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "HeadphoneDTO [brand=" + brand + ", \nmodelNo=" + modelNo + ", \nprice=" + price + ", \nbass=" + bass
				+ ", \ncolore=" + colore + ", \nTypeAndWeight=" + TypeAndWeight + ", \ncustomerName=" + customerName
				+ ", \ninvoiceNo=" + invoiveNo + ", \nmfgDate=" + mfgDate + ", \nwarrantyPeriod=" + warrantyPeriod + "]";
	}

		}
	

