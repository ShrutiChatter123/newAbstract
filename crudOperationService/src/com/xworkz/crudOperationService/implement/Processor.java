package com.xworkz.crudOperationService.implement;

import java.time.LocalDate;
import java.util.Date;

import com.xworkz.crudOperationService.dto.ApplicationDTO;
import com.xworkz.crudOperationService.service.Application;

public class Processor implements Application {

	@Override
	public boolean validateAndSave(ApplicationDTO dto) {
		System.out.println("validateAndSave running in appliction");
		String name = dto.getName();
		Double version = dto.getVersion();
		LocalDate createdDate = dto.getCreatedDate();
		double size = dto.getSize();
		String developedBy = dto.getDevelopedBy();
		String type = dto.getType();
		int price = dto.getPrice();
		LocalDate firstVersionReleaseDate = dto.getFirstVersionReleaseDate();
		LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
		LocalDate nextVersionReleaseDate = dto.getNextVersionReleaseDate();
		String trialDays = dto.getTrialDays();
		String langUsed = dto.getLangUsed();
		double minProcessorSpeed = dto.getMinProcessorSpeed();
		double minRamSpaceRequired = dto.getMinRamSpaceRequired();
		int ageLimit = dto.getAgeLimit();
		int noOfDownloads = dto.getNoOfDownloads();
		int rating = dto.getRating();
		String osTypeSupported = dto.getOsTypeSupported();

		boolean validname = false;
		boolean validversion = false;
		boolean validCreatedDate = false;
		boolean validsize = false;
		boolean validdevelopedBy = false;
		boolean validtype = false;
		boolean validprice = false;
		boolean validfirstVersionReleaseDate = false;
		boolean validcurrentVersionReleaseDate = false;
		boolean validNextVersionReleaseDate = false;
		boolean validtrialDays = false;
		boolean validlangUsed = false;
		boolean validminProcessorSpeed = false;
		boolean validminRamSpaceRequired = false;
		boolean validageLimit = false;
		boolean validnoOfDownloads = false;
		boolean validrating = false;
		boolean validosTypeSupported = false;

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			System.out.println("name is valid");
		} else {
			System.out.println("name not valid");
			return true;
		}
		if (version > 0 && version < 60) {
			System.out.println("version is valid");
		} else {
			System.out.println("version is not valid");
			return true;
		}
		LocalDate tomorrow = LocalDate.now();
		LocalDate startDate = LocalDate.of(2004, 5, 6);
		if (createdDate != null && createdDate.isBefore(tomorrow) && createdDate.isAfter(startDate)) {
			System.out.println("createdDate valid");
		} else {
			System.out.println("createdDate not valid");
			return true;
		}
		if (size > 0 && size < 5) {
			System.out.println("size is valid");
		} else {
			System.out.println("size is not valid");
			return true;
		}
		if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length() < 30) {
			System.out.println("developedBy is valid");
		} else {
			System.out.println("developed By is not valid");
			return true;
		}
		if (type != null && !type.isEmpty() && type.length() > 3 && type.length() < 30) {
			System.out.println("type is valid ");
		} else {
			System.out.println("type is not valid");
			return true;
		}
		if (price > 0 && price < 100) {
			System.out.println("price is vaid");
		} else {
			System.out.println("price is not valid");
			return true;
		}
		LocalDate tomorrow1 = firstVersionReleaseDate = LocalDate.now().plusDays(1);
		LocalDate startDate1 = firstVersionReleaseDate.of(2005, 5, 7);
		if (firstVersionReleaseDate != null && firstVersionReleaseDate.isBefore(tomorrow)
				&& firstVersionReleaseDate.isAfter(startDate1)) {
			System.out.println("firstVersionReleaseDate is valid");
		} else {
			System.out.println("firstVersionReleaseDate is not valid");
			return true;
		}
		LocalDate tommorrow2 = currentVersionReleaseDate = LocalDate.now().plusDays(1);
		LocalDate startDate2 = currentVersionReleaseDate.of(20022, 11, 14);
		if (currentVersionReleaseDate != null && !currentVersionReleaseDate.isEqual(currentVersionReleaseDate)) {
			System.out.println("currentVersionReleaseDate is valid");
		} else {
			System.out.println("currentVersionReleaseDate is not valid");
			return true;
		}
		LocalDate date = LocalDate.now();
		if (nextVersionReleaseDate != null && nextVersionReleaseDate.isAfter(date)) {
			System.out.println("NextVersionReleaseDate is valid");
			return true;
		} else {
			System.out.println("NextVersionReleaseDateis invalid");
		}

		if (trialDays != null && !trialDays.isEmpty() && trialDays.length() > 3 && trialDays.length() < 30) {
			System.out.println("trialDays is valid");
		} else {
			System.out.println("trialDays is not valid");
			return true;
		}
		if (langUsed != null && !langUsed.isEmpty() && langUsed.length() > 3 && langUsed.length() < 30) {
			System.out.println("langUsed is valid");
		} else {
			System.out.println("langUsed is not valid");
			return true;
		}
		if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
			System.out.println("minProcessorSpeed is valid");
		} else {
			System.out.println("minProcessorSpeed is not valid");
			return true;
		}
		if (minRamSpaceRequired > 0 && minRamSpaceRequired < 100) {
			System.out.println("sminRamSpaceRequired is valid");
		} else {
			System.out.println("minRamSpaceRequired is not valid");
			return true;
		}
		if (ageLimit > 0 && ageLimit < 100) {
			System.out.println("ageLimit is valid");
		} else {
			System.out.println("ageLimit is not valid");
			return true;
		}
		if (noOfDownloads > 0 && noOfDownloads < 100) {
			System.out.println("noOfDownloads is not valid");
		} else {
			System.out.println("noOfDownloads is not valid");
			return true;
		}
		if (rating > 0 && rating < 100) {
			System.out.println("rating is bvalid");
		} else {
			System.out.println("rating is not valid");
			return true;
		}
		if (osTypeSupported != null && !osTypeSupported.isEmpty() && osTypeSupported.length() > 3
				&& osTypeSupported.length() < 30) {
			System.out.println("osTypeSupported is valid");
		} else {
			System.out.println("osTypeSupported is not valid");
		}

		return false;

	}

}
