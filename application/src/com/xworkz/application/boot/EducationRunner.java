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

		EducationService service1 = new EducationServiceImpl(repository);

		EducationDTO dto2 = new EducationDTO(4, "B.com", 75, "BTVU", LocalDate.of(2022, 16, 19),
				LocalDate.of(2023, 8, 8), 1, "General", "rohini");

		EducationService service2 = new EducationServiceImpl(repository);

		EducationDTO dto3 = new EducationDTO(9, "Bsc", 65, "RCU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Sagar");

		EducationService service3 = new EducationServiceImpl(repository);
		
		EducationDTO dto4 = new EducationDTO(7, "BA", 95, "RCU", LocalDate.of(2022, 1, 15),
				LocalDate.of(2023, 1, 2), 1, "General", "Sakshi");

		EducationService service4 = new EducationServiceImpl(repository);
		
		EducationDTO dto5 = new EducationDTO(7, "BE", 55, "VTU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Abhi");

		EducationService service5 = new EducationServiceImpl(repository);
		
		EducationDTO dto6 = new EducationDTO(3, "BSC", 65, "RCU", LocalDate.of(2022, 7, 15),
				LocalDate.of(2023, 8, 6), 1, "General", "Adhya");

		EducationService service6 = new EducationServiceImpl(repository);
		
		EducationDTO dto7 = new EducationDTO(8, "BA", 57, "RCU", LocalDate.of(2022, 7, 19),
				LocalDate.of(2023, 9, 8), 1, "General", "raju");

		EducationService service7 = new EducationServiceImpl(repository);
		
		EducationDTO dto8 = new EducationDTO(9, "BE", 65, "GPTU", LocalDate.of(2022, 17, 15),
				LocalDate.of(2023, 4, 9), 8, "Gag", "Sana");

		EducationService service8 = new EducationServiceImpl(repository);
		
		EducationDTO dto9 = new EducationDTO(1, "BEd", 88, "RCU", LocalDate.of(2022, 3, 15),
				LocalDate.of(2023, 1, 9), 1, "General", "Arunsajjan");

		EducationService service9 = new EducationServiceImpl(repository);
		
		EducationDTO dto10 = new EducationDTO(6, "BA", 76, "VTU", LocalDate.of(2022, 15, 15),
				LocalDate.of(2023, 14, 2), 8, "General", "Basu");

		EducationService service10 = new EducationServiceImpl(repository);
		
		EducationDTO dto11= new EducationDTO(9, "BA", 77, "Government", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Banashankari");

		EducationService service11 = new EducationServiceImpl(repository);
		
		EducationDTO dto12= new EducationDTO(1, "BA", 65, "Channamma", LocalDate.of(2022, 3, 15),
				LocalDate.of(2023, 9, 2), 1, "General", "Kavyashree");

		EducationService service12 = new EducationServiceImpl(repository);
		
		EducationDTO dto13= new EducationDTO(4, "Bsc", 85, "Channamma", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 14, 8), 1, "General", "Kavya");

		EducationService service13 = new EducationServiceImpl(repository);
		
		EducationDTO dto14= new EducationDTO(1, "BA", 65, "VTU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Bharat");

		EducationService service14 = new EducationServiceImpl(repository);
		
		EducationDTO dto15= new EducationDTO(1, "BA", 65, "DTO", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 4, 2), 1, "General", "Shreenidhi");

		EducationService service15 = new EducationServiceImpl(repository);
		
		EducationDTO dto16= new EducationDTO(1, "BA", 65, "Government", LocalDate.of(2022, 11, 13),
				LocalDate.of(2023, 4, 4), 1, "General", "Bhadra");

		EducationService service16 = new EducationServiceImpl(repository);
		
		EducationDTO dto17= new EducationDTO(1, "BE", 93, "DTO", LocalDate.of(2022, 11, 1),
				LocalDate.of(2023, 8, 6), 1, "General", "Nagamma");

		EducationService service17 = new EducationServiceImpl(repository);
		
		EducationDTO dto18= new EducationDTO(7, "Bsc", 72, "DTO", LocalDate.of(2022, 11, 8),
				LocalDate.of(2023, 6, 9), 1, "General", "Dvani");

		EducationService service18 = new EducationServiceImpl(repository);
		
		EducationDTO dto19= new EducationDTO(9, "nursing", 45, "RCU", LocalDate.of(2022, 31, 15),
				LocalDate.of(2023, 7, 2), 1, "General", "Anand");

		EducationService service19 = new EducationServiceImpl(repository);
		
		EducationDTO dto20= new EducationDTO(8, "Bsc Nursing", 79, "VTU", LocalDate.of(2022, 14, 15),
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

			boolean save1 = service1.validateAndThenSave(dto1);
			System.out.println("Save:" + save1);
			System.out.println(service1.find(dto1));
			System.out.println(service1.findByCandidateName("Manjula"));
			System.out.println(service1.findByCandidateNameAndUniversity("Manjula", "Bangalore university"));
			System.out.println(service1.findBacklogByCandidateNameAndDegreeNameAndUniversity("Manjula", "com", "Bangalore university"));
			System.out.println(service1.findbyCandidateNameAndStartDateAndEndDAte("Manjula", LocalDate.of(2022, 1, 1), LocalDate.now()));
			System.out.println(service1.findPercentageByCandidateName("Manjula"));
			System.out.println(service1.findStreamByCandidateNameAndDegreeNameAndUniversity("Manjula", "com", "Bangalore University"));
			System.out.println(service1.findIdByCandidateNameAndDegreeNameAndUnivaersity("Manjula", "com", "Bangalore university"));
			System.out.println(service1.findUniversityByCandidateName("Manjula"));
			System.out.println(service1.getTotal());
			System.out.println("**********==================================**************");

			boolean save2 = service2.validateAndThenSave(dto2);
			System.out.println("Save:" + save2);
			System.out.println(service2.find(dto2));
			System.out.println(service2.findByCandidateName("Rohini"));
			System.out.println(service2.findByCandidateNameAndUniversity("Rohini", "BTVU"));
			System.out.println(service2.findBacklogByCandidateNameAndDegreeNameAndUniversity("Rohini", "B.Com", "BTVU"));
			System.out.println(service2.findbyCandidateNameAndStartDateAndEndDAte("Rohini", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service2.findPercentageByCandidateName("Rohini"));
			System.out.println(service2.findStreamByCandidateNameAndDegreeNameAndUniversity("Rohini", "B.Com", "BTVU"));
			System.out.println(service2.findIdByCandidateNameAndDegreeNameAndUnivaersity("Rohini", "B.Com", "BTVU"));
			System.out.println(service2.findUniversityByCandidateName("Rohini"));
			System.out.println(service2.getTotal());
			System.out.println("**********==================================**************");

			boolean save3 = service3.validateAndThenSave(dto3);
			System.out.println("Save:" + save3);
			System.out.println(service3.find(dto3));
			System.out.println(service3.findByCandidateName("Sagar"));
			System.out.println(service3.findByCandidateNameAndUniversity("Sagar", "RCU"));
			System.out.println(service3.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sagar", "Bsc", "RCU"));
			System.out.println(service3.findbyCandidateNameAndStartDateAndEndDAte("Sagar", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service3.findPercentageByCandidateName("Sagar"));
			System.out.println(service3.findStreamByCandidateNameAndDegreeNameAndUniversity("Sagar", "Bsc", "RCU"));
			System.out.println(service3.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sagar", "Bsc", "RCU"));
			System.out.println(service3.findUniversityByCandidateName("Sagar"));
			System.out.println(service3.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save4 = service4.validateAndThenSave(dto4);
			System.out.println("Save:" + save4);
			System.out.println(service4.find(dto4));
			System.out.println(service4.findByCandidateName("Sachin"));
			System.out.println(service4.findByCandidateNameAndUniversity("Sachin", "RCU"));
			System.out.println(service4.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service4.findbyCandidateNameAndStartDateAndEndDAte("Sachin", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service4.findPercentageByCandidateName("Sachin"));
			System.out.println(service4.findStreamByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service4.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sachin", "BA", "RCU"));
			System.out.println(service4.findUniversityByCandidateName("Sachin"));
			System.out.println(service4.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save5 = service5.validateAndThenSave(dto5);
			System.out.println("Save:" + save5);
			System.out.println(service5.find(dto5));
			System.out.println(service5.findByCandidateName("Sakshi"));
			System.out.println(service5.findByCandidateNameAndUniversity("Sakshi", "RCU"));
			System.out.println(service5.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sakshi", "BA", "RCU"));
			System.out.println(service5.findbyCandidateNameAndStartDateAndEndDAte("Sakshi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service5.findPercentageByCandidateName("Sakshi"));
			System.out.println(service5.findStreamByCandidateNameAndDegreeNameAndUniversity("Sakshi", "BA", "RCU"));
			System.out.println(service5.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sakshi", "BA", "RCU"));
			System.out.println(service5.findUniversityByCandidateName("Sakshi"));
			System.out.println(service5.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save6 = service6.validateAndThenSave(dto6);
			System.out.println("Save:" + save6);
			System.out.println(service6.find(dto6));
			System.out.println(service6.findByCandidateName("Abhi"));
			System.out.println(service6.findByCandidateNameAndUniversity("Abhi", "VTU"));
			System.out.println(service6.findBacklogByCandidateNameAndDegreeNameAndUniversity("Anuj", "BE", "VTU"));
			System.out.println(service6.findbyCandidateNameAndStartDateAndEndDAte("Abhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service6.findPercentageByCandidateName("Abhi"));
			System.out.println(service6.findStreamByCandidateNameAndDegreeNameAndUniversity("Abhi", "BE", "VTU"));
			System.out.println(service6.findIdByCandidateNameAndDegreeNameAndUnivaersity("Abhi", "BE", "VTU"));
			System.out.println(service6.findUniversityByCandidateName("Abhi"));
			System.out.println(service6.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save7 = service7.validateAndThenSave(dto7);
			System.out.println("Save:" + save7);
			System.out.println(service7.find(dto7));
			System.out.println(service7.findByCandidateName("Adhya"));
			System.out.println(service7.findByCandidateNameAndUniversity("Adhya", "RCU"));
			System.out.println(service7.findBacklogByCandidateNameAndDegreeNameAndUniversity("Adhya", "BSC", "RCU"));
			System.out.println(service7.findbyCandidateNameAndStartDateAndEndDAte("Adhya", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service7.findPercentageByCandidateName("Adhya"));
			System.out.println(service7.findStreamByCandidateNameAndDegreeNameAndUniversity("Adhya", "BSC", "RCU"));
			System.out.println(service7.findIdByCandidateNameAndDegreeNameAndUnivaersity("Adhya", "BSC", "RCU"));
			System.out.println(service7.findUniversityByCandidateName("Adhya"));
			System.out.println(service7.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save8 = service8.validateAndThenSave(dto8);
			System.out.println("Save:" + save8);
			System.out.println(service8.find(dto8));
			System.out.println(service8.findByCandidateName("raju"));
			System.out.println(service8.findByCandidateNameAndUniversity("raju", "RCU"));
			System.out.println(service8.findBacklogByCandidateNameAndDegreeNameAndUniversity("Amit", "BA", "RCU"));
			System.out.println(service8.findbyCandidateNameAndStartDateAndEndDAte("raju", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service8.findPercentageByCandidateName("raju"));
			System.out.println(service8.findStreamByCandidateNameAndDegreeNameAndUniversity("raju", "BA", "RCU"));
			System.out.println(service8.findIdByCandidateNameAndDegreeNameAndUnivaersity("raju", "BA", "RCU"));
			System.out.println(service8.findUniversityByCandidateName("raju"));
			System.out.println(service8.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save9 = service9.validateAndThenSave(dto9);
			System.out.println("Save:" + save9);
			System.out.println(service9.find(dto9));
			System.out.println(service9.findByCandidateName("Sana"));
			System.out.println(service9.findByCandidateNameAndUniversity("Sana", "GPTU"));
			System.out.println(service9.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sana", "BE", "GPTU"));
			System.out.println(service9.findbyCandidateNameAndStartDateAndEndDAte("Arun", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service9.findPercentageByCandidateName("Sana"));
			System.out.println(service9.findStreamByCandidateNameAndDegreeNameAndUniversity("Sana", "BE", "GPTU"));
			System.out.println(service9.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sana", "BE", "GPTU"));
			System.out.println(service9.findUniversityByCandidateName("Sana"));
			System.out.println(service9.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save10 = service10.validateAndThenSave(dto10);
			System.out.println("Save:" + save10);
			System.out.println(service10.find(dto10));
			System.out.println(service10.findByCandidateName("Arunsajjan"));
			System.out.println(service10.findByCandidateNameAndUniversity("Arunsajjan", "RCU"));
			System.out.println(service10.findBacklogByCandidateNameAndDegreeNameAndUniversity("Basu", "BED", "RCU"));
			System.out.println(service10.findbyCandidateNameAndStartDateAndEndDAte("Arunsajjan", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service10.findPercentageByCandidateName("Arunsajjan"));
			System.out.println(service10.findStreamByCandidateNameAndDegreeNameAndUniversity("Arunsajjan", "BED", "RCU"));
			System.out.println(service10.findIdByCandidateNameAndDegreeNameAndUnivaersity("Arunsajjan", "BED", "RCU"));
			System.out.println(service10.findUniversityByCandidateName("Arunsajjan"));
			System.out.println(service10.getTotal());
			System.out.println("***********==================================*************");
			
			boolean save11 = service11.validateAndThenSave(dto11);
			System.out.println("Save:" + save11);
			System.out.println(service11.find(dto11));
			System.out.println(service11.findByCandidateName("Basu"));
			System.out.println(service11.findByCandidateNameAndUniversity("Basu", "VTU"));
			System.out.println(service11.findBacklogByCandidateNameAndDegreeNameAndUniversity("Basu", "BE", "VTU"));
			System.out.println(service11.findbyCandidateNameAndStartDateAndEndDAte("Basu", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service11.findPercentageByCandidateName("Basu"));
			System.out.println(service11.findStreamByCandidateNameAndDegreeNameAndUniversity("Basu", "BA", "VTU"));
			System.out.println(service11.findIdByCandidateNameAndDegreeNameAndUnivaersity("Basu", "BE", "VTU"));
			System.out.println(service11.findUniversityByCandidateName("Basu"));
			System.out.println(service11.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save12 = service12.validateAndThenSave(dto12);
			System.out.println("Save:" + save12);
			System.out.println(service12.find(dto12));
			System.out.println(service12.findByCandidateName("Banashankari"));
			System.out.println(service12.findByCandidateNameAndUniversity("BavBanashankariya", "Government"));
			System.out.println(service12.findBacklogByCandidateNameAndDegreeNameAndUniversity("Banashankari", "BA", "RCU"));
			System.out.println(service12.findbyCandidateNameAndStartDateAndEndDAte("Banashankari", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service12.findPercentageByCandidateName("Banashankari"));
			System.out.println(service12.findStreamByCandidateNameAndDegreeNameAndUniversity("Banashankari", "BA", "Government"));
			System.out.println(service12.findIdByCandidateNameAndDegreeNameAndUnivaersity("Banashankari", "BA", "Government"));
			System.out.println(service12.findUniversityByCandidateName("Banashankari"));
			System.out.println(service12.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save13 = service13.validateAndThenSave(dto13);
			System.out.println("Save:" + save13);
			System.out.println(service13.find(dto13));
			System.out.println(service13.findByCandidateName("Kavyashree"));
			System.out.println(service13.findByCandidateNameAndUniversity("Kavyashree", "Channamma"));
			System.out.println(service13.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kavyashree", "BA", "Channamma"));
			System.out.println(service13.findbyCandidateNameAndStartDateAndEndDAte("Bharati", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service13.findPercentageByCandidateName("Kavyashree"));
			System.out.println(service13.findStreamByCandidateNameAndDegreeNameAndUniversity("Kavyashree", "BA", "Channamma"));
			System.out.println(service13.findIdByCandidateNameAndDegreeNameAndUnivaersity("Kavyashree", "BA", "Channamma"));
			System.out.println(service13.findUniversityByCandidateName("Kavyashree"));
			System.out.println(service13.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save14 = service14.validateAndThenSave(dto14);
			System.out.println("Save:" + save14);
			System.out.println(service14.find(dto14));
			System.out.println(service14.findByCandidateName("Kavya"));
			System.out.println(service14.findByCandidateNameAndUniversity("Kavya", "RCU"));
			System.out.println(service14.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kavya", "BSC", "Channamma"));
			System.out.println(service14.findbyCandidateNameAndStartDateAndEndDAte("Kavya", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service14.findPercentageByCandidateName("Kavya"));
			System.out.println(service14.findStreamByCandidateNameAndDegreeNameAndUniversity("Kavya", "BA", "Channamma"));
			System.out.println(service14.findIdByCandidateNameAndDegreeNameAndUnivaersity("Kavya", "BA", "Channamma"));
			System.out.println(service14.findUniversityByCandidateName("Kavya"));
			System.out.println(service14.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save15 = service15.validateAndThenSave(dto15);
			System.out.println("Save:" + save15);
			System.out.println(service15.find(dto15));
			System.out.println(service15.findByCandidateName("Bharat"));
			System.out.println(service15.findByCandidateNameAndUniversity("Bharat", "VTU"));
			System.out.println(service15.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "VTU"));
			System.out.println(service15.findbyCandidateNameAndStartDateAndEndDAte("Bharat", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service15.findPercentageByCandidateName("Bharat"));
			System.out.println(service15.findStreamByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "VTU"));
			System.out.println(service15.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bharat", "BA", "VTU"));
			System.out.println(service15.findUniversityByCandidateName("Bharat"));
			System.out.println(service15.getTotal());
			System.out.println("**********==================================**************");
			
			boolean save16 = service16.validateAndThenSave(dto16);
			System.out.println("Save:" + save16);
			System.out.println(service16.find(dto16));
			System.out.println(service16.findByCandidateName("Shreenidhi"));
			System.out.println(service16.findByCandidateNameAndUniversity("Shreenidhi", "DTO"));
			System.out.println(service16.findBacklogByCandidateNameAndDegreeNameAndUniversity("Shreenidhi", "BA", "DTO"));
			System.out.println(service16.findbyCandidateNameAndStartDateAndEndDAte("Shreenidhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service16.findPercentageByCandidateName("Shreenidhi"));
			System.out.println(service16.findStreamByCandidateNameAndDegreeNameAndUniversity("Shreenidhi", "BA", "DTO"));
			System.out.println(service16.findIdByCandidateNameAndDegreeNameAndUnivaersity("Shreenidhi", "BA", "DTO"));
			System.out.println(service16.findUniversityByCandidateName("Shreenidhi"));
			System.out.println(service16.getTotal());
			System.out.println("************==================================************");
			
			boolean save17 = service17.validateAndThenSave(dto17);
			System.out.println("Save:" + save17);
			System.out.println(service17.find(dto17));
			System.out.println(service17.findByCandidateName("Bhadra"));
			System.out.println(service17.findByCandidateNameAndUniversity("Bhadra", "RCU"));
			System.out.println(service17.findBacklogByCandidateNameAndDegreeNameAndUniversity("Charan", "BA", "Government"));
			System.out.println(service17.findbyCandidateNameAndStartDateAndEndDAte("Bhadra", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service17.findPercentageByCandidateName("Bhadra"));
			System.out.println(service17.findStreamByCandidateNameAndDegreeNameAndUniversity("Bhadra", "BA", "Government"));
			System.out.println(service17.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bhadra", "BA", "Government"));
			System.out.println(service17.findUniversityByCandidateName("Bhadra"));
			System.out.println(service17.getTotal());
			System.out.println("****************==================================*******");
			
			boolean save18 = service18.validateAndThenSave(dto18);
			System.out.println("Save:" + save18);
			System.out.println(service18.find(dto18));
			System.out.println(service18.findByCandidateName("Charanhi"));
			System.out.println(service18.findByCandidateNameAndUniversity("Nagamma", "DTO"));
			System.out.println(service18.findBacklogByCandidateNameAndDegreeNameAndUniversity("Charanhi", "BA", "DTO"));
			System.out.println(service18.findbyCandidateNameAndStartDateAndEndDAte("Charanhi", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service18.findPercentageByCandidateName("Charanhi"));
			System.out.println(service18.findStreamByCandidateNameAndDegreeNameAndUniversity("Charanhi", "BE", "DTO"));
			System.out.println(service18.findIdByCandidateNameAndDegreeNameAndUnivaersity("Charanhi", "BE", "DTO"));
			System.out.println(service18.findUniversityByCandidateName("Charanhi"));
			System.out.println(service18.getTotal());
			System.out.println("==================================");
			
			boolean save19= service19.validateAndThenSave(dto19);
			System.out.println("Save:" + save19);
			System.out.println(service19.find(dto19));
			System.out.println(service19.findByCandidateName("Dvani"));
			System.out.println(service19.findByCandidateNameAndUniversity("Dvani", "DTO"));
			System.out.println(service19.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dvani", "BSc", "DTO"));
			System.out.println(service19.findbyCandidateNameAndStartDateAndEndDAte("Dvani", LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service19.findPercentageByCandidateName("Dvani"));
			System.out.println(service19.findStreamByCandidateNameAndDegreeNameAndUniversity("Dvani", "BSc", "DTO"));
			System.out.println(service19.findIdByCandidateNameAndDegreeNameAndUnivaersity("Dvani", "BSc", "DTO"));
			System.out.println(service19.findUniversityByCandidateName("Dvani"));
			System.out.println(service19.getTotal());
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
