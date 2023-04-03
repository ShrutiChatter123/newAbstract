package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationInvalidException;
import com.xworkz.application.repositry.EducationRepository;
import com.xworkz.application.utility.EducationValidUtil;

public class EducationServiceImpl implements EducationService {

	private EducationRepository educationRepository;

	public EducationServiceImpl(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws EducationInvalidException {
		if (dto != null) {
			System.out.println("DTO is not null,so validate");
			int id = dto.getId();
			String degreeName = dto.getDegreeName();
			int percentage = dto.getPercentage();
			String university = dto.getUniversity();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			int backlog = dto.getBacklog();
			String stream = dto.getStream();
			String candidateName = dto.getCandidateName();

			boolean validId = false;
			boolean validDegreeName = false;
			boolean validPercentage = false;
			boolean validUniversity = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validBacklog = false;
			boolean validStream = false;
			boolean validCandidateName = false;

			if (EducationValidUtil.validInt(id)) {
				System.out.println("Valid Id");
				validId = true;
			} else {
				System.err.println("Invalid Id");
			}
			if (EducationValidUtil.validString(degreeName)) {
				System.out.println("valid degreeName");
				validDegreeName = true;
			} else {
				System.err.println("Invalid degreeName");
			}
			if (EducationValidUtil.validInt(percentage)) {
				System.out.println("Valid Percentage");
				validPercentage = true;
			} else {
				System.err.println("Invalid Percentage");
			}
			if (EducationValidUtil.validString(university)) {
				System.out.println
				
				("Valid University");
				validUniversity = true;
			} else {
				System.err.println("Invalid University");
			}
			if (EducationValidUtil.validLocalDate(startDate)) {
				System.out.println("Valid startDate");
				validStartDate = true;
			} else {
				System.err.println("Invalid startDate");
			}
			if (EducationValidUtil.validLocalDate(endDate)) {
				System.out.println("Valid EndDate");
				validEndDate = true;
				
				
				
			} else {
				System.err.println("Invalid EndDate");
			}
			if (EducationValidUtil.validInt(backlog)) {
				System.out.println("Valid baklog");
				validBacklog = true;
			} else {
				System.err.println("Invalid backlog");
			}
			if (EducationValidUtil.validString(stream)) {
				System.out.println("Valid Stream");
				validStream = true;
			} else {
				System.err.println("Invalid Stream");
			}
			if (EducationValidUtil.validString(candidateName)) {
				System.out.println("Valid CandidateName");
				validCandidateName = true;
			} else {
				System.err.println("Invalid CandidateName");
			}
			if (EducationValidUtil.validFlag(validId, validDegreeName, validPercentage, validUniversity, validStartDate,
					validEndDate, validBacklog, validStream, validCandidateName)) {
				System.out.println("Validation done so save");
				boolean exist = this.educationRepository.isExist(dto);
				if (!exist) {
					boolean save = this.educationRepository.save(dto);
					System.out.println("DTO is not duplicate save it");
					return save;
				} else {
					System.err.println("DTO is dupliacte so dont save");
					throw new EducationInvalidException("DATA is invalid");

				}

			} else {
				System.err.println("Validation Not Done so dont save");
			}
		} else {
			System.err.println("Dto is null so dont validate");
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) throws EducationInvalidException {
		if (dto != null) {
			this.educationRepository.find(dto);
		}
		throw new EducationInvalidException("Dto validation exception: passing null dto");
	}

	@Override
	public EducationDTO findByCandidateName(String name) throws EducationInvalidException {
		if (EducationValidUtil.validString(name)) {
			this.educationRepository.findByCandidateName(name);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name");
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university)
			throws EducationInvalidException {
		if (EducationValidUtil.validString(name) && EducationValidUtil.validString(university)) {
			this.educationRepository.findByCandidateNameAndUniversity(name, university);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name/university");
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) throws EducationInvalidException {
		if (EducationValidUtil.validString(candidateName) && EducationValidUtil.validString(degreeName)
				&& EducationValidUtil.validString(univarsity)) {
			this.educationRepository.findBacklogByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					univarsity);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name/degreeName/university");
	}

	@Override
	public EducationDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) throws EducationInvalidException {
		if (EducationValidUtil.validString(candidateName) && EducationValidUtil.validLocalDate(startDate)
				&& EducationValidUtil.validLocalDate(EndDate)) {
			this.educationRepository.findbyCandidateNameAndStartDateAndEndDAte(candidateName, startDate, EndDate);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name/startdate/enddate");
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) throws EducationInvalidException {
		if (EducationValidUtil.validString(candidateName)) {
			this.educationRepository.findPercentageByCandidateName(candidateName);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name");
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) throws EducationInvalidException {
		if (EducationValidUtil.validString(candidateName) && EducationValidUtil.validString(degreeName)
				&& EducationValidUtil.validString(universityName)) {
			this.educationRepository.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					universityName);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name/degreeName/UniversityName");

	}
	@Override
	public int findIdByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) throws EducationInvalidException {
		if(EducationValidUtil.validString(candidateName)&& EducationValidUtil.validString(degreeName) && EducationValidUtil.validString(university)) {
			this.educationRepository.findIdByCandidateNameAndDegreeNameAndUnivaersity(candidateName, degreeName, university);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid name/degreeName/UniversityName");
	}
	@Override
	public String findUniversityByCandidateName(String CandidateName) throws EducationInvalidException {
		if(EducationValidUtil.validString(CandidateName)) {
			this.educationRepository.findUniversityByCandidateName(CandidateName);
		}
		throw new EducationInvalidException("Data validation exception:Passing invalid CandidateName");
	}
	@Override
	public int getTotal() {
		return this.educationRepository.total();
	}

}
