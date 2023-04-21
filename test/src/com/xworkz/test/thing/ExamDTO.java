package com.xworkz.test.thing;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ExamDTO implements Serializable {

	private String degreeName;
	private int percentage;
	private String university;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlog;
	private String stream;
	private String candidateName;
	private double salary;
	private String pattern;
	
	public ExamDTO(String degreeName, int percentage, String university, LocalDate startDate, LocalDate endDate,
			int backlog, String stream, String candidateName, double salary, String pattern) {
		super();
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.stream = stream;
		this.candidateName = candidateName;
		this.salary = salary;
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return "ExamDTO [degreeName=" + degreeName + ", percentage=" + percentage + ", university=" + university
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", backlog=" + backlog + ", stream=" + stream
				+ ", candidateName=" + candidateName + ", salary=" + salary + ", pattern=" + pattern + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, candidateName, degreeName, endDate, pattern, percentage, salary, startDate, stream,
				university);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamDTO other = (ExamDTO) obj;
		return backlog == other.backlog && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(degreeName, other.degreeName) && Objects.equals(endDate, other.endDate)
				&& Objects.equals(pattern, other.pattern) && percentage == other.percentage
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(stream, other.stream)
				&& Objects.equals(university, other.university);
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getBacklog() {
		return backlog;
	}

	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	


	
	
}
