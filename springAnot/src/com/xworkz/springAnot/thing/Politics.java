package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Politics {

	private String party;
	private int NoOfParticipates;
	private String loction;
	private int votingdate;
	private String topOne;
	private int totalVoter;
	private int noOfParty;
	private int voterNo;
	private String participatesforhead;
	private long pastMlaNo;
	private String currentParticipateName;
	private String currentLocation;
	private int minage;
	private int maxAge;
	private int salary;

	@Value("BJP")
	public void setParty(String party) {
		this.party = party;
	}

	@Value("8")
	public void setNoOfParticipates(int noOfParticipates) {
		NoOfParticipates = noOfParticipates;
	}

	@Value("Banglore")
	public void setLoction(String loction) {
		this.loction = loction;
	}

	@Value("10")
	public void setVotingdate(int votingdate) {
		this.votingdate = votingdate;
	}

	@Value("modi")
	public void setTopOne(String topOne) {
		this.topOne = topOne;
	}

	@Value("100")
	public void setTotalVoter(int totalVoter) {
		this.totalVoter = totalVoter;
	}

	@Value("5")

	public void setNoOfParty(int noOfParty) {
		this.noOfParty = noOfParty;
	}

	@Value("11")

	public void setVoterNo(int voterNo) {
		this.voterNo = voterNo;
	}

	@Value("rajvar")
	public void setParticipatesforhead(String participatesforhead) {
		this.participatesforhead = participatesforhead;
	}

	@Value("765567897")
	public void setPastMlaNo(long pastMlaNo) {
		this.pastMlaNo = pastMlaNo;
	}

	@Value("somanna gowda")
	public void setCurrentParticipateName(String currentParticipateName) {
		this.currentParticipateName = currentParticipateName;
	}

	@Value("Bidar")
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Value("25")
	public void setMinage(int minage) {
		this.minage = minage;
	}

	@Value("84")
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Value("10000")
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Politics [party=" + party + ", NoOfParticipates=" + NoOfParticipates + ", loction=" + loction
				+ ", votingdate=" + votingdate + ", topOne=" + topOne + ", totalVoter=" + totalVoter + ", noOfParty="
				+ noOfParty + ", voterNo=" + voterNo + ", participatesforhead=" + participatesforhead + ", pastMlaNo="
				+ pastMlaNo + ", currentParticipateName=" + currentParticipateName + ", currentLocation="
				+ currentLocation + ", minage=" + minage + ", maxAge=" + maxAge + ", salary=" + salary + "]";
	}
	
	
	public String State() {
		System.out.println("calling state method");
		return "Karnataka";
	}
	
	
	
	
	
	

}
