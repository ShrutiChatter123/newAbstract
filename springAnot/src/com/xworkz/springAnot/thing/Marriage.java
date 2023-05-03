package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Marriage {
	
	@Value("sounalys")
	private String brideName;
	@Value("harish")
	private String groomName;
	@Value("60")
	private int noOfAttender;
	@Value("gadag")
	private String location;
	@Value("456789876")
	private long groomNo;
	@Value("923456764")
	private long brideNo;
	@Value("karthikrao")
	private String brideFatherName;
	@Value("swaraj")
	private String groomFatherName;
	@Value("567876")
	private long marriageExpense;
	@Value("hubli")
	private String brideProper;
	@Value("rajawath")
	private String groomProper;
	@Value("savitri")
	private String brideMother;
	@Value("ganga")
	private String groomMother;
	@Value("15")
	private int noOfFunctions;
	@Value("7")
	private int date;
	
	public String pairs() {
		System.out.println("calling pairs ");
		return "Sonalya-harish";
	}
	
	
	
	
}
