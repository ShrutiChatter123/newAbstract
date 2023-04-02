package com.xworkz.application.repositry;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public interface EducationRepository {
	
	boolean save(EducationDTO dto);

	default boolean isExist(EducationDTO dto) {
		return false;
	}

	default EducationDTO find(EducationDTO dto) {
		return null;
	}

	default EducationDTO findByCandidateName(String name) {
		return null;

	}

	default EducationDTO findByCandidateNameAndUniversity(String name, String university) {
		return null;

	}

	default boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) {
		return false;

	}

	default EducationDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) {
		return null;

	}

	default double findPercentageByCandidateName(String candidateName) {
		return 0;

	}

	default String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) {
		return null;

	}

	default int findIdByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) {
		return 0;

	}

	default String findUniversityByCandidateName(String CandidateName) {
		return null;

	}

	default int total() {
		return 0;

	}

}
