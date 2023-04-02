package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidEducationException;

public interface EducationService {
	
	boolean validateAndThenSave(EducationDTO dto) throws InvalidEducationException;
	
	default EducationDTO find(EducationDTO dto) throws InvalidEducationException{
		return null;
	}

	default EducationDTO findByCandidateName(String name) throws InvalidEducationException {
		return null;

	}

	default EducationDTO findByCandidateNameAndUniversity(String name, String university) throws InvalidEducationException {
		return null;

	}

	default boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) throws InvalidEducationException{
		return false;

	}

	default EducationDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) throws InvalidEducationException {
		return null;

	}

	default double findPercentageByCandidateName(String candidateName)throws InvalidEducationException {
		return 0;

	}

	default String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) throws InvalidEducationException{
		return null;

	}

	default int findIdByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) throws InvalidEducationException {
		return 0;

	}

	default String findUniversityByCandidateName(String CandidateName) throws InvalidEducationException{
		return null;

	}

	default int getTotal() {
		return 0;

	}


}
