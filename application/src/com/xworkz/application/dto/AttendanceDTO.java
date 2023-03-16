package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class AttendanceDTO {

	private String name;
	private String teacherName;
	private long registerBookNo;
	private LocalDate attLocalDate;
	private int noOfStudents;
	
	public AttendanceDTO() {
		System.out.println("no-org constructor");
	}

	public String getName() {
		return name;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public long getRegisterBookNo() {
		return registerBookNo;
	}

	public LocalDate getAttLocalDate() {
		return attLocalDate;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void setRegisterBookNo(long registerBookNo) {
		this.registerBookNo = registerBookNo;
	}

	public void setAttLocalDate(LocalDate attLocalDate) {
		this.attLocalDate = attLocalDate;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attLocalDate, name, noOfStudents, registerBookNo, teacherName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return Objects.equals(attLocalDate, other.attLocalDate) && Objects.equals(name, other.name)
				&& noOfStudents == other.noOfStudents && registerBookNo == other.registerBookNo
				&& Objects.equals(teacherName, other.teacherName);
	}

	@Override
	public String toString() {
		return "AttendanceDTO [name=" + name + ", \nteacherName=" + teacherName + ", \nregisterBookNo=" + registerBookNo
				+ ", attLocalDate=" + attLocalDate + ", \nnoOfStudents=" + noOfStudents + "]";
	}
	
	
	
	
	
	
	
	
	
}
