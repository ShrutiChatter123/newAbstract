package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationInvalidException;

public interface EducationService {
	
	boolean validateAndThenSave(EducationDTO dto) throws EducationInvalidException;
	
	default EducationDTO find(EducationDTO dto) throws EducationInvalidException{
		return null;
	}

	default EducationDTO findByCandidateName(String name) throws EducationInvalidException {
		return null;

	}

	default EducationDTO findByCandidateNameAndUniversity(String name, String university) throws EducationInvalidException {
		return null;

	}

	default boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) throws EducationInvalidException{
		return false;

	}

	default EducationDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) throws EducationInvalidException {
		return null;

	}

	default double findPercentageByCandidateName(String candidateName)throws EducationInvalidException {
		return 0;

	}

	default String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) throws EducationInvalidException{
		return null;

	}

	default int findIdByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) throws EducationInvalidException {
		return 0;

	}

	default String findUniversityByCandidateName(String CandidateName) throws EducationInvalidException{
		return null;

	}

	default int getTotal() {
		return 0;

	}


}
