package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO {

	private int id;
	private String degreeName;
	private int percentage;
	private String university;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlog;
	private String stream;
	private String candidateName;
	
	public EducationDTO(int id, String degreeName, int percentage, String university, LocalDate startDate,
			LocalDate endDate, int backlog, String stream, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.stream = stream;
		this.candidateName = candidateName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, candidateName, degreeName, endDate, id, percentage, startDate, stream, university);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDTO other = (EducationDTO) obj;
		return backlog == other.backlog && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(degreeName, other.degreeName) && Objects.equals(endDate, other.endDate)
				&& id == other.id && percentage == other.percentage && Objects.equals(startDate, other.startDate)
				&& Objects.equals(stream, other.stream) && Objects.equals(university, other.university);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "EducatioDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", university="
				+ university + ", startDate=" + startDate + ", endDate=" + endDate + ", backlog=" + backlog
				+ ", stream=" + stream + ", candidateName=" + candidateName + "]";
	}
	
	

	
}
