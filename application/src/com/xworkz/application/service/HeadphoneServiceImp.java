package com.xworkz.application.service;

import java.awt.image.ColorModel;
import java.time.LocalDate;

import com.xworkz.application.dto.Brand;
import com.xworkz.application.dto.Colore;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.dto.TypeAndWeight;
import com.xworkz.application.utility.HeadphoneValidUtit;

public class HeadphoneServiceImp implements HeadphoneService {

	@Override
	public boolean ValidateAndThenSave(HeadphoneDTO dto) {
		if (dto != null) {
			System.out.println("HeadphoneDTO is validating now");

			Brand brand = dto.getBrand();
			String model = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			Colore colore = dto.getColore();
			TypeAndWeight typeAndWeight = dto.getTypeAndWeight();
			String custom = dto.getCustomerName();
			int invoice = dto.getInvoiceNo();
			LocalDate date = dto.getMfgDate();
			int warranty = dto.getWarrantyPeriod();

			boolean validBrand = false;
			boolean validModel = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validColore = false;
			boolean validTypeAndWeight = false;
			boolean validCustomerName = false;
			boolean validInvoiceNo = false;
			boolean validMfgDate = false;
			boolean validWarrantyPeriod = false;

			if (brand != null) {
				System.out.println("brand is valid");
				validBrand = true;
			} else {
				System.err.println("brand is not valid");
			}

			if(HeadphoneValidUtit.validString(model)) {
				System.out.println("valid model");
				validModel=true;
			}else {
				System.out.println("invalid model");
			}
				
			if (HeadphoneValidUtit.validDouble(price)) {
				System.out.println("price is valid");
				validPrice = true;
			} else {
			System.err.println("price is invalid");
			}

			if (bass = null != null) {
				System.out.println("bass is valid");
				validBass = false;
			} else {
				System.err.println("bass is invalid");
			}
			if (colore != null) {
				System.out.println("colore is valid");
				validColore = false;
			} else {
				System.err.println("colore is invalid");
			}
			if (typeAndWeight != null) {
				System.out.println("typeAndWeight is valid");
				validTypeAndWeight = false;
			} else {
				System.err.println("typeAndWeight is invalid");
			}
			if (custom != null && custom.isEmpty() && custom.length() < 3 && custom.length() > 30) {
				System.out.println("custom is valid");
				validCustomerName = false;
			} else {
				System.err.println("custom is invalid");
			}
			if (HeadphoneValidUtit.validint(invoice)) {
				System.out.println("invoice is valid");
				validInvoiceNo = true;
			} else {
				System.err.println("invoice is invalid");
			}


			if (warranty < 0 && warranty > 100) {
				System.out.println("warranty is valid");
				validWarrantyPeriod = false;
			} else {
				System.err.println("warranty is invalid");
			}
		

			if( validBrand&& validModel&& validPrice && validBass&&  validColore&& validTypeAndWeight&& validCustomerName&& 
				validInvoiceNo&& validMfgDate &&validWarrantyPeriod) {
				return true;
				
			}
			
		}

		return false;
	}

}
