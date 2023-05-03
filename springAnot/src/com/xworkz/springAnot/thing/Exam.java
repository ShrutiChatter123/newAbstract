package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Exam {

	private int date;
	private String boardName;
	private String collageName;
	private int noOfStudents;
	private int age;
	private int minAge;
	private int maxAge;
	private String topLanguage;
	private String writtenLanguage;
	private int lastDateForExm;
	private int totalFees;
	private String location;
	private int handicaft;

	@Value("7")
	public void setDate(int date) {
		this.date = date;
	}

	@Value("VTU")
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Value("AITM")
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	@Value("150")
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Value("17")
	public void setAge(int age) {
		this.age = age;
	}

	@Value("16")
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	@Value("21")
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Value("English")
	public void setTopLanguage(String topLanguage) {
		this.topLanguage = topLanguage;
	}

	@Value("Kannada")
	public void setWrittenLanguage(String writtenLanguage) {
		this.writtenLanguage = writtenLanguage;
	}

	@Value("17")
	public void setLastDateForExm(int lastDateForExm) {
		this.lastDateForExm = lastDateForExm;
	}

	@Value("12111")
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}

	@Value("belagavi")
	public void setLocation(String location) {
		this.location = location;
	}

	@Value("7")
	public void setHandicaft(int handicaft) {
		this.handicaft = handicaft;
	}

	@Override
	public String toString() {
		return "Exam [date=" + date + ", boardName=" + boardName + ", collageName=" + collageName + ", noOfStudents="
				+ noOfStudents + ", age=" + age + ", minAge=" + minAge + ", maxAge=" + maxAge + ", topLanguage="
				+ topLanguage + ", writtenLanguage=" + writtenLanguage + ", lastDateForExm=" + lastDateForExm
				+ ", totalFees=" + totalFees + ", location=" + location + ", handicaft=" + handicaft + "]";
	}
	
	public String validator() {
		System.out.println("calling validator");
		return "headCordinator";
	}
	
	
	
	
	

}
