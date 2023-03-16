package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceDTORunner {

	public static void main(String[] args) {

		AttendanceDTO attendanceDTO=new AttendanceDTO();
		attendanceDTO.setName("Karthic");
		attendanceDTO.setTeacherName("Omkar");
		attendanceDTO.setRegisterBookNo(564554);
		attendanceDTO.setAttLocalDate(LocalDate.now());
		attendanceDTO.setNoOfStudents(54);
		System.out.println(attendanceDTO);
	
		System.out.println(attendanceDTO.hashCode());
		System.out.println(attendanceDTO.equals(attendanceDTO));
		
		
		
		
	}

}
