package com.xworkz.test.service;

import java.time.LocalDate;

import com.xworkz.test.Exception.ExamValidException;
import com.xworkz.test.thing.ExamDTO;


public interface ExamService {

boolean validateAndThenSave(ExamDTO dto) throws ExamValidException;
	
	default ExamDTO find(ExamDTO dto) throws ExamValidException{
		return null;
	}

	default ExamDTO findByCandidateName(String name) throws ExamValidException {
		return null;

	}

	default ExamDTO findByCandidateNameAndUniversity(String name, String university) throws ExamValidException {
		return null;

	}

	default boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) throws ExamValidException{
		return false;

	}

	default ExamDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) throws ExamValidException {
		return null;

	}

	default double findPercentageByCandidateName(String candidateName)throws ExamValidException {
		return 0;

	}

	default String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) throws ExamValidException{
		return null;

	}

	default int findByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) throws ExamValidException {
		return 0;

	}

	default String findUniversityByCandidateName(String CandidateName) throws ExamValidException{
		return null;

	}
	
	default String findBySalaryAndPattern(String pattern)throws ExamValidException {
		
		return pattern;
		
	}

	default int getTotal() {
		return 0;

	}

	
	
}
