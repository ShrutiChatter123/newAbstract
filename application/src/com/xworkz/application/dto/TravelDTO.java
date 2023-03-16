package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO {

	private int noOfFriends;
	private String teamHead;
	private int noOfPlacess;
	private LocalDate attLocalDate;
	private String drivarName;
	
	public TravelDTO() {
		System.out.println("no-org constructor to TravelDTO ");
	}

	public int getNoOfFriends() {
		return noOfFriends;
	}

	public String getTeamHead() {
		return teamHead;
	}

	public int getNoOfPlacess() {
		return noOfPlacess;
	}

	public LocalDate getAttLocalDate() {
		return attLocalDate;
	}

	public String getDrivarName() {
		return drivarName;
	}

	public void setNoOfFriends(int noOfFriends) {
		this.noOfFriends = noOfFriends;
	}

	public void setTeamHead(String teamHead) {
		this.teamHead = teamHead;
	}

	public void setNoOfPlacess(int noOfPlacess) {
		this.noOfPlacess = noOfPlacess;
	}

	public void setAttLocalDate(LocalDate attLocalDate) {
		this.attLocalDate = attLocalDate;
	}

	public void setDrivarName(String drivarName) {
		this.drivarName = drivarName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attLocalDate, drivarName, noOfFriends, noOfPlacess, teamHead);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(attLocalDate, other.attLocalDate) && Objects.equals(drivarName, other.drivarName)
				&& noOfFriends == other.noOfFriends && noOfPlacess == other.noOfPlacess
				&& Objects.equals(teamHead, other.teamHead);
	}

	@Override
	public String toString() {
		return "TravelDTO [\nnoOfFriends=" + noOfFriends + ", \nteamHead=" + teamHead + ", \nnoOfPlacess=" + noOfPlacess
				+ ", \nattLocalDate=" + attLocalDate + ", \ndrivarName=" + drivarName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
