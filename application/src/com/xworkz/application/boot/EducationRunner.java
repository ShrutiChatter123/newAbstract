package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationMemoryFullException;
import com.xworkz.application.exception.EducationInvalidException;
import com.xworkz.application.repositry.EducationRepository;
import com.xworkz.application.repositry.EducationRepositoryImpl;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImpl;

public class EducationRunner {
	
	public static void main(String[] args) {
		EducationDTO dto = new EducationDTO(1, "BE degree", 70,"VTU..", LocalDate.of(2022, 11, 10),
				LocalDate.of(2023, 3,2), 1, "Civil", "Shruti");

		EducationRepository repository = new EducationRepositoryImpl();
		EducationService service = new EducationServiceImpl(repository);

		EducationDTO dto1 = new EducationDTO(2, "com", 68, "Bangalore Univarsity", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 6, 6), 1, "CS", "Manjula");



		EducationDTO dto2 = new EducationDTO(4, "B.com", 75, "BTVU", LocalDate.of(2022, 11, 19),
				LocalDate.of(2023, 8, 8), 1, "General", "rohini");



		EducationDTO dto3 = new EducationDTO(9, "Bsc", 65, "RCU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Sagar");


		
		EducationDTO dto4 = new EducationDTO(7, "BA", 95, "RCU", LocalDate.of(2022, 1, 15),
				LocalDate.of(2023, 1, 2), 1, "General", "Sakshi");



		EducationDTO dto5 = new EducationDTO(7, "BE", 55, "VTU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Abhi");



		
		EducationDTO dto6 = new EducationDTO(3, "BSC", 65, "RCU", LocalDate.of(2022, 7, 15),
				LocalDate.of(2023, 8, 6), 1, "General", "Adhya");



		
		EducationDTO dto7 = new EducationDTO(8, "BA", 57, "RCU", LocalDate.of(2022, 7, 19),
				LocalDate.of(2023, 9, 8), 1, "General", "raju");



		EducationDTO dto8 = new EducationDTO(9, "BE", 65, "GPTU", LocalDate.of(2022, 10, 15),
				LocalDate.of(2023, 4, 9), 8, "Gag", "Sana");



		EducationDTO dto9 = new EducationDTO(1, "BEd", 88, "RCU", LocalDate.of(2022, 3, 15),
				LocalDate.of(2023, 1, 9), 1, "General", "Arunsajjan");



		
		EducationDTO dto10 = new EducationDTO(6, "BA", 76, "VTU", LocalDate.of(2022, 5, 15),
				LocalDate.of(2023, 1, 2), 8, "General", "Basu");



		EducationDTO dto11= new EducationDTO(9, "BA", 77, "Government", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Banashankari");


		
		EducationDTO dto12= new EducationDTO(1, "BA", 65, "Channamma", LocalDate.of(2022, 3, 15),
				LocalDate.of(2023, 9, 2), 1, "General", "Kavyashree");


		
		EducationDTO dto13= new EducationDTO(4, "Bsc", 85, "Channamma", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 12, 8), 1, "General", "Kavya");


		
		EducationDTO dto14= new EducationDTO(1, "BA", 65, "VTU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Bharat");

		
		EducationDTO dto15= new EducationDTO(1, "BA", 65, "DTO", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Shreenidhi");

		
		EducationDTO dto16= new EducationDTO(1, "BA", 65, "Government", LocalDate.of(2022, 11, 13),
				LocalDate.of(2023, 4, 4), 1, "General", "Bhadra");

		
		EducationDTO dto17= new EducationDTO(1, "BE", 93, "DTO", LocalDate.of(2022, 11, 1),
				LocalDate.of(2023, 8, 6), 1, "General", "Nagamma");

		
		EducationDTO dto18= new EducationDTO(7, "Bsc", 72, "DTO", LocalDate.of(2022, 11, 8),
				LocalDate.of(2023, 6, 9), 1, "General", "Dvani");

		
		EducationDTO dto19= new EducationDTO(9, "nursing", 45, "RCU", LocalDate.of(2022, 3, 15),
				LocalDate.of(2023, 7, 2), 1, "General", "Anand");

		
		
		EducationDTO dto20= new EducationDTO(8, "Bsc Nursing", 79, "VTU", LocalDate.of(2022, 1, 15),
				LocalDate.of(2023, 4, 11), 1, "General", "Swati");

		EducationService service20 = new EducationServiceImpl(repository);
		try {

			boolean save = service.validateAndThenSave(dto);
			System.out.println("Save:" + save);
			System.out.println(service.find(dto));
			System.out.println(service.findByCandidateName("Shruti"));
			System.out.println(service.findByCandidateNameAndUniversity("Shruti", "VTU..."));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Shruti", "BE degree", "VTU..."));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Shruti", LocalDate.of(2022, 11, 10), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Shruti"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Shruti", "BE degree", "VTU..."));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Shruti", "BE degree", "VTU..."));
			System.out.println(service.findUniversityByCandidateName("Shruti"));
			System.out.println(service.getTotal());
			System.out.println("=================================");

			boolean save1 = service.validateAndThenSave(dto1);
			System.out.println("Save:" + save1);
			System.out.println(service.find(dto1));
			System.out.println(service.findByCandidateName("Manjula"));
			System.out.println(service.findByCandidateNameAndUniversity("Manjula", "Bangalore university"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Manjula", "com", "Bangalore university"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Manjula", LocalDate.of(2022, 1, 1), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Manjula"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Manjula", "com", "Bangalore University"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Manjula", "com", "Bangalore university"));
			System.out.println(service.findUniversityByCandidateName("Manjula"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");

			boolean save2 = service.validateAndThenSave(dto2);
			System.out.println("Save:" + save2);
			System.out.println(service.find(dto2));
			System.out.println(service.findByCandidateName("Rohini"));
			System.out.println(service.findByCandidateNameAndUniversity("Rohini", "BTVU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Rohini", "B.Com", "BTVU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Rohini", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Rohini"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Rohini", "B.Com", "BTVU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Rohini", "B.Com", "BTVU"));
			System.out.println(service.findUniversityByCandidateName("Rohini"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");

			boolean save3 = service.validateAndThenSave(dto3);
			System.out.println("Save:" + save3);
			System.out.println(service.find(dto3));
			System.out.println(service.findByCandidateName("Sagar"));
			System.out.println(service.findByCandidateNameAndUniversity("Sagar", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sagar", "Bsc", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Sagar", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Sagar"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Sagar", "Bsc", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sagar", "Bsc", "RCU"));
			System.out.println(service.findUniversityByCandidateName("Sagar"));
			System.out.println(service.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save4 = service.validateAndThenSave(dto4);
			System.out.println("Save:" + save4);
			System.out.println(service.find(dto4));
			System.out.println(service.findByCandidateName("Sachin"));
			System.out.println(service.findByCandidateNameAndUniversity("Sachin", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Sachin", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Sachin"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sachin", "BA", "RCU"));
			System.out.println(service.findUniversityByCandidateName("Sachin"));
			System.out.println(service.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save5 = service.validateAndThenSave(dto5);
			System.out.println("Save:" + save5);
			System.out.println(service.find(dto5));
			System.out.println(service.findByCandidateName("Sakshi"));
			System.out.println(service.findByCandidateNameAndUniversity("Sakshi", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sakshi", "BA", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Sakshi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Sakshi"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Sakshi", "BA", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sakshi", "BA", "RCU"));
			System.out.println(service.findUniversityByCandidateName("Sakshi"));
			System.out.println(service.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save6 = service.validateAndThenSave(dto6);
			System.out.println("Save:" + save6);
			System.out.println(service.find(dto6));
			System.out.println(service.findByCandidateName("Abhi"));
			System.out.println(service.findByCandidateNameAndUniversity("Abhi", "VTU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Anuj", "BE", "VTU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Abhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Abhi"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Abhi", "BE", "VTU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Abhi", "BE", "VTU"));
			System.out.println(service.findUniversityByCandidateName("Abhi"));
			System.out.println(service.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save7 = service.validateAndThenSave(dto7);
			System.out.println("Save:" + save7);
			System.out.println(service.find(dto7));
			System.out.println(service.findByCandidateName("Adhya"));
			System.out.println(service.findByCandidateNameAndUniversity("Adhya", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Adhya", "BSC", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Adhya", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Adhya"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Adhya", "BSC", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Adhya", "BSC", "RCU"));
			System.out.println(service.findUniversityByCandidateName("Adhya"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save8 = service.validateAndThenSave(dto8);
			System.out.println("Save:" + save8);
			System.out.println(service.find(dto8));
			System.out.println(service.findByCandidateName("raju"));
			System.out.println(service.findByCandidateNameAndUniversity("raju", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Amit", "BA", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("raju", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("raju"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("raju", "BA", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("raju", "BA", "RCU"));
			System.out.println(service.findUniversityByCandidateName("raju"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save9 = service.validateAndThenSave(dto9);
			System.out.println("Save:" + save9);
			System.out.println(service.find(dto9));
			System.out.println(service.findByCandidateName("Sana"));
			System.out.println(service.findByCandidateNameAndUniversity("Sana", "GPTU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sana", "BE", "GPTU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Arun", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Sana"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Sana", "BE", "GPTU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sana", "BE", "GPTU"));
			System.out.println(service.findUniversityByCandidateName("Sana"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save10 = service.validateAndThenSave(dto10);
			System.out.println("Save:" + save10);
			System.out.println(service.find(dto10));
			System.out.println(service.findByCandidateName("Arunsajjan"));
			System.out.println(service.findByCandidateNameAndUniversity("Arunsajjan", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Basu", "BED", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Arunsajjan", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Arunsajjan"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Arunsajjan", "BED", "RCU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Arunsajjan", "BED", "RCU"));
			System.out.println(service.findUniversityByCandidateName("Arunsajjan"));
			System.out.println(service.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save11 = service.validateAndThenSave(dto11);
			System.out.println("Save:" + save11);
			System.out.println(service.find(dto11));
			System.out.println(service.findByCandidateName("Basu"));
			System.out.println(service.findByCandidateNameAndUniversity("Basu", "VTU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Basu", "BE", "VTU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Basu", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Basu"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Basu", "BA", "VTU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Basu", "BE", "VTU"));
			System.out.println(service.findUniversityByCandidateName("Basu"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save12 = service.validateAndThenSave(dto12);
			System.out.println("Save:" + save12);
			System.out.println(service.find(dto12));
			System.out.println(service.findByCandidateName("Banashankari"));
			System.out.println(service.findByCandidateNameAndUniversity("BavBanashankariya", "Government"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Banashankari", "BA", "RCU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Banashankari", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Banashankari"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Banashankari", "BA", "Government"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Banashankari", "BA", "Government"));
			System.out.println(service.findUniversityByCandidateName("Banashankari"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save13 = service.validateAndThenSave(dto13);
			System.out.println("Save:" + save13);
			System.out.println(service.find(dto13));
			System.out.println(service.findByCandidateName("Kavyashree"));
			System.out.println(service.findByCandidateNameAndUniversity("Kavyashree", "Channamma"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kavyashree", "BA", "Channamma"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Bharati", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Kavyashree"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Kavyashree", "BA", "Channamma"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Kavyashree", "BA", "Channamma"));
			System.out.println(service.findUniversityByCandidateName("Kavyashree"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save14 = service.validateAndThenSave(dto14);
			System.out.println("Save:" + save14);
			System.out.println(service.find(dto14));
			System.out.println(service.findByCandidateName("Kavya"));
			System.out.println(service.findByCandidateNameAndUniversity("Kavya", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kavya", "BSC", "Channamma"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Kavya", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Kavya"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Kavya", "BA", "Channamma"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Kavya", "BA", "Channamma"));
			System.out.println(service.findUniversityByCandidateName("Kavya"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save15 = service.validateAndThenSave(dto15);
			System.out.println("Save:" + save15);
			System.out.println(service.find(dto15));
			System.out.println(service.findByCandidateName("Bharat"));
			System.out.println(service.findByCandidateNameAndUniversity("Bharat", "VTU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "VTU"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Bharat", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Bharat"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "VTU"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bharat", "BA", "VTU"));
			System.out.println(service.findUniversityByCandidateName("Bharat"));
			System.out.println(service.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save16 = service.validateAndThenSave(dto16);
			System.out.println("Save:" + save16);
			System.out.println(service.find(dto16));
			System.out.println(service.findByCandidateName("Shreenidhi"));
			System.out.println(service.findByCandidateNameAndUniversity("Shreenidhi", "DTO"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Shreenidhi", "BA", "DTO"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Shreenidhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Shreenidhi"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Shreenidhi", "BA", "DTO"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Shreenidhi", "BA", "DTO"));
			System.out.println(service.findUniversityByCandidateName("Shreenidhi"));
			System.out.println(service.getTotal());
			System.out.println("************==================================************");
			
			boolean save17 = service.validateAndThenSave(dto17);
			System.out.println("Save:" + save17);
			System.out.println(service.find(dto17));
			System.out.println(service.findByCandidateName("Bhadra"));
			System.out.println(service.findByCandidateNameAndUniversity("Bhadra", "RCU"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Charan", "BA", "Government"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Bhadra", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Bhadra"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Bhadra", "BA", "Government"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bhadra", "BA", "Government"));
			System.out.println(service.findUniversityByCandidateName("Bhadra"));
			System.out.println(service.getTotal());
			System.out.println("****************==================================*******");
			
			boolean save18 = service.validateAndThenSave(dto18);
			System.out.println("Save:" + save18);
			System.out.println(service.find(dto18));
			System.out.println(service.findByCandidateName("Charanhi"));
			System.out.println(service.findByCandidateNameAndUniversity("Nagamma", "DTO"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Charanhi", "BA", "DTO"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Charanhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Charanhi"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Charanhi", "BE", "DTO"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Charanhi", "BE", "DTO"));
			System.out.println(service.findUniversityByCandidateName("Charanhi"));
			System.out.println(service.getTotal());
			System.out.println("==================================");
			
			boolean save19= service.validateAndThenSave(dto19);
			System.out.println("Save:" + save19);
			System.out.println(service.find(dto19));
			System.out.println(service.findByCandidateName("Dvani"));
			System.out.println(service.findByCandidateNameAndUniversity("Dvani", "DTO"));
			System.out.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dvani", "BSc", "DTO"));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Dvani", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Dvani"));
			System.out.println(service.findStreamByCandidateNameAndDegreeNameAndUniversity("Dvani", "BSc", "DTO"));
			System.out.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Dvani", "BSc", "DTO"));
			System.out.println(service.findUniversityByCandidateName("Dvani"));
			System.out.println(service.getTotal());
			System.out.println("==================================");
			
			boolean save20= service20.validateAndThenSave(dto20);
			System.out.println("Save:" + save20);
			System.out.println(service20.find(dto20));
			System.out.println(service20.findByCandidateName("Anand"));
			System.out.println(service20.findByCandidateNameAndUniversity("Anand", "RCU"));
			System.out.println(service20.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dharmesh", "Nursing", "RCU"));
			System.out.println(service20.findbyCandidateNameAndStartDateAndEndDAte("Anand", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service20.findPercentageByCandidateName("Anand"));
			System.out.println(service20.findStreamByCandidateNameAndDegreeNameAndUniversity("Anand", "Nursing", "RCU"));
			System.out.println(service20.findIdByCandidateNameAndDegreeNameAndUnivaersity("Anand", "Nursing", "RCU"));
			System.out.println(service20.findUniversityByCandidateName("Anand"));
			System.out.println(service20.getTotal());
			System.out.println("==============================");

			
			
		} catch (EducationInvalidException e) {
			e.getMessage();
		}catch(EducationMemoryFullException e) {
			e.getMessage();
		}

	}

}
