package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repositry.ApplicationRepositry;

public class ApplicationServiceImp implements ApplicationService {

	private ApplicationRepositry repo;
	
	public ApplicationServiceImp(ApplicationRepositry repo) {
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(ApplicationDTO dto) {
		System.out.println("DTO is not null now validating properties");
		String name = dto.getName();
		Double version = dto.getVersion();
		LocalDate createdDate = dto.getCreatedDate();
		double size = dto.getSize();
		String developedBy = dto.getDevelopedBy();
		Type type = dto.getType();
		int price = dto.getPrice();
		LocalDate firstVersionReleaseDate = dto.getFirstVersionReleaseDate();
		LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
		LocalDate nextVersionReleaseDate = dto.getNextVersionReleaseDate();
		String trialDays = dto.getTrialDays();
		LangUsed langUsed = dto.getLangUsed();
		double minProcessorSpeed = dto.getMinProcessorSpeed();
		double minRamSpaceRequired = dto.getMinRamSpaceRequired();
		boolean internetNeeded = dto.isInternetNeeded();
		int ageLimit = dto.getAgeLimit();
		int noOfDownloads = dto.getNoOfDownloads();
		int rating = dto.getRating();
		String osTypeSupported = dto.getOsTypeSupported();

		boolean validName = false;
		boolean validVersion = false;
		boolean validCreatedDate = false;
		boolean validSize = false;
		boolean validDevelopedBy = false;
		boolean validType = false;
		boolean validPrice = false;
		boolean validFirstVersionReleaseDate = false;
		boolean validCurrentVersionReleaseDate = false;
		boolean validNextVersionReleaseDate = false;
		boolean validTrialDays = false;
		boolean validLangUsed = false;
		boolean validMinProcessorSpeed = false;
		boolean validMinRamSpaceRequired = false;
		boolean validInternetNeeded = false;
		boolean validAgeLimit = false;
		boolean validNoOfDownloads = false;
		boolean validRating = false;
		boolean validosTypeSupported = false;

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			System.out.println("name is valid");
			validName = true;
		} else {
			System.out.println("name is invalid");

		}
		if (version > 0 && version < 100) {
			System.out.println("version is valid");
			validVersion = true;
		} else {
			System.out.println("version is invalid");

		}
		LocalDate tomorrow = LocalDate.now();
		LocalDate startDate = LocalDate.of(2004, 5, 6);
		if (createdDate != null && createdDate.isBefore(tomorrow) && createdDate.isAfter(startDate)) {
			System.out.println("createdDate valid");
			
			validCreatedDate = true;
		} else {
			System.out.println("createdDate not valid");

		}
		if (size > 0 && size < 5) {
			System.out.println("size is valid");
			validSize = true;
		} else {
			System.out.println("size is not valid");

		}
		if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length() < 30) {
			System.out.println("developedBy is valid");
		} else {
			System.out.println("developed By is not valid");
			validDevelopedBy = true;
		}
		if (type != null) {
			System.out.println("type is valid ");
			validType = true;
		} else {
			System.out.println("type is not valid");

		}
		if (price > 0 && price < 100) {
			System.out.println("price is vaid");
			validPrice = true;
		} else {
			System.out.println("price is not valid");

		}
		LocalDate firstVersionReleaseDate1 = LocalDate.now().plusDays(1);

		LocalDate startDate1 = firstVersionReleaseDate.of(2005, 5, 7);
		if (firstVersionReleaseDate != null && firstVersionReleaseDate.isBefore(firstVersionReleaseDate)
				&& firstVersionReleaseDate.isAfter(startDate1) && firstVersionReleaseDate.isAfter(startDate1)) {
			System.out.println("firstVersionReleaseDate is valid");
			validFirstVersionReleaseDate = true;
		} else {
			System.out.println("firstVersionReleaseDate is not valid");

		}
		LocalDate currentVersionReleaseDate1 = LocalDate.now().plusDays(1);
		if (currentVersionReleaseDate != null && !currentVersionReleaseDate.isEqual(currentVersionReleaseDate)) {
			System.out.println("currentVersionReleaseDate is valid");
			validCurrentVersionReleaseDate = true;
		} else {
			System.out.println("currentVersionReleaseDate is not valid");

		}
		LocalDate date = LocalDate.now();
		if (nextVersionReleaseDate != null && nextVersionReleaseDate.isAfter(date)) {
			System.out.println("NextVersionReleaseDate is valid");
			validNextVersionReleaseDate = true;

		} else {
			System.out.println("NextVersionReleaseDateis invalid");
		}

		if (trialDays != null && !trialDays.isEmpty() && trialDays.length() > 3 && trialDays.length() < 30) {
			System.out.println("trialDays is valid");
			validTrialDays = true;
		} else {
			System.out.println("trialDays is not valid");

		}
		if (langUsed != null) {
			System.out.println("langUsed is valid");
			validLangUsed = true;
		} else {
			System.out.println("langUsed is not valid");

		}
		if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
			System.out.println("minProcessorSpeed is valid");
			validMinProcessorSpeed = true;
		} else {
			System.out.println("minProcessorSpeed is not valid");

		}
		if (minRamSpaceRequired > 0 && minRamSpaceRequired < 100) {
			System.out.println("sminRamSpaceRequired is valid");
			validMinRamSpaceRequired = true;
		} else {
			System.out.println("minRamSpaceRequired is not valid");

		}

		if (internetNeeded = null != null) {
			System.out.println("internetNeeded is valid");
			validInternetNeeded = true;
		} else {
			System.out.println("internetNeeded is not valid");

		}

		if (ageLimit > 0 && ageLimit < 100) {
			System.out.println("ageLimit is valid");
			validAgeLimit = true;
		} else {
			System.out.println("ageLimit is not valid");

		}
		if (noOfDownloads > 0 && noOfDownloads < 100) {
			System.out.println("noOfDownloads is  valid");
			validNoOfDownloads = true;
		} else {
			System.out.println("noOfDownloads is not valid");

		}
		if (rating > 0 && rating < 100) {
			System.out.println("rating is bvalid");
			validRating = true;
		} else {
			System.out.println("rating is not valid");

		}
		if (osTypeSupported != null && !osTypeSupported.isEmpty() && osTypeSupported.length() > 3
				&& osTypeSupported.length() < 30) {
			System.out.println("osTypeSupported is valid");
			validosTypeSupported = true;
		} else {
			System.out.println("osTypeSupported is not valid");

		}
		if (validName && validVersion && validCreatedDate && validSize && validDevelopedBy && validType && validPrice
				&& validFirstVersionReleaseDate && validCurrentVersionReleaseDate && validNextVersionReleaseDate
				&& validTrialDays && validLangUsed && validMinProcessorSpeed && validMinRamSpaceRequired
				&& validInternetNeeded && validAgeLimit && validNoOfDownloads && validRating && validosTypeSupported)
			return true;

		return false;
	}

}
