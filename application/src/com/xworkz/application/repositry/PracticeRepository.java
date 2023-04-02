package com.xworkz.application.repositry;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.dto.PracticeDTO;
import com.xworkz.application.exception.EducationValidException;
import com.xworkz.application.utility.EducationUtil;

public interface PracticeRepository {

	boolean save(PracticeDTO dto);

	boolean isExist(PracticeDTO dto);

	int totalSave();
	
	default PracticeDTO findById(int id) {
		return null;
		
	}
	
	default PracticeDTO findByName(String name) {
		return null;
		
	}
	
	default PracticeDTO findByNameandIDd(String name,int id) {
		return null;
		
	}
	
	
	
	
	
	@Override
	public boolean validateAndSave(EducationDTO dto) {
		System.out.println("DTO is not invalid now initializing");
		if (dto != null) {
			System.out.println("index ");
		}

		boolean validId = false;
		boolean validDegree = false;
		boolean validPercentage = false;
		boolean validUniversity = false;
		boolean validStart = false;
		boolean validEnd = false;
		boolean validBacklog = false;
		boolean validStream = false;
		boolean validCandidate = false;

		int id = dto.getId();
		if (EducationUtil.validId(id)) {
			validId = true;
			System.out.println("id is valid");
		} else {
			System.out.println("id invalid");
		}

		String degree = dto.getDegreeName();
		if (EducationUtil.validString(degree)) {
			validDegree = true;
			System.out.println("degree is valid");
		} else {
			System.out.println("degree invalid");
		}

		int percentage = dto.getPercentage();
		if (EducationUtil.validId(percentage)) {
			validPercentage = true;
			System.out.println("percentage is valid");
		} else {
			System.out.println("percentafe invalid");
		}

		String university = dto.getUniversity();
		if (EducationUtil.validString(university)) {
			validUniversity = true;
			System.out.println("university valid");
		} else {
			System.out.println("university invalid");
		}

		LocalDate start = dto.getStartDate();
		if (EducationUtil.validDate(start)) {
			validStart = true;
			System.out.println("start date is valid");
		} else {
			System.out.println("start date invalid");
		}

		LocalDate end = dto.getEndDate();
		if (EducationUtil.validDate(endDate)) {
			validEnd = true;
			System.out.println("end date is valid");
		} else {
			System.out.println("end date invalid");
		}

		int backlog = dto.getBacklog();
		if (EducationUtil.validId(backlog)) {
			validBacklog = true;
			System.out.println("baclklog valid");
		} else {
			System.out.println("backlog invalid");
		}

		String stream = dto.getStrem();
		if (EducationUtil.validString(stream)) {
			validStream = true;
			System.out.println("stream is valid");
		} else {
			System.out.println("stram invalid");
		}

		String candidate = dto.getCandidateName();
		if (EducationUtil.validString(candidate)) {
			validCandidate = true;
			System.out.println("candidateis valid");
		} else {
			System.out.println("candidate invalid");
		}

		if (EducationUtil.validFlags(validId, validDegree, validPercentage, validUniversity, validStart, validEnd,
				validBacklog, validStream, validCandidate)) {
			System.out.println("validation done to save");
			boolean temp = repo.save(dto);
			if (temp) {
				return true;

			} else {
				return false;
			}

		}

	}

	@Override
	public boolean isExist(EducationDTO dto) {
		// TODO Auto-generated method stub
		return false;

	}
	
	public boolean find(EducationDTO dto) throws EducationValidException {
		if(dto!=null) {
			if(repo.find(dto)) {
				return true;
			}
		}
		throw new EducationValidException("data validation exception: passing null DTO ");
		
	}
	
	public EducationDTO findByCandidateName(String name) throws EducationValidException {
		if(EducationUtil.validString(name)) {
			EducationDTO dto=repo.findByCandidateName(name);
			return dto;
		}
		throw new EducationValidException("education validation exception: passing null dto") ;
	}
	
	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university)
			throws EducationValidException {
		if(EducationUtil.validString(university)) {
			EducationDTO dto=repo.findByCandidateNameAndUniversity(name, university);
			return dto;
		}
		throw new EducationValidException("EducationValidException : passing dto") ;
	}
	
	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws EducationValidException {
			if(candidateName!=null) {
				if(repo.find(candidateName)) {
					
					
					
					return true;
				}
			}
		throw new EducationValidException("EducationValidException in :passing null dto") ;
	}
	
	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) throws EducationValidException {
		
		return EducationValidException.super.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate, endDate);
	}
	
	@Override
	public double findPercentageByCandidateName(String candidateName) throws EducationValidException {
		
		
		return EducationService.super.findPercentageByCandidateName(candidateName);
	}
	
	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws EducationValidException {
		if(EducationUtil.validString(university)) {
			String dto=repo.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		throw new EducationValidException("EducationValidException in :passing null dto");
	}
	
	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws EducationValidException {
		if(EducationUtil.validId(0)) {
			int candi=repo.findIdByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		throw new EducationValidException("EducationValidException in: dto null") ;
	}
	
	@Override
	public String findUnivercityByCandidateName(String candidateName) throws EducationValidException {
		if(EducationUtil.validString(candidateName)) {
			String dto=repo.findUnivercityByCandidateName(candidateName);
			return candidateName;
		}
		throw new EducationValidException("EducationValidException in:dto null") ;
	}
	
	public int total() {
		return repo.total();
	}


}

}
