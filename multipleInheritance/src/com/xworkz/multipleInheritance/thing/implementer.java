package com.xworkz.multipleInheritance.thing;

public class implementer extends AbstractInfo implements PassPortRule,DubaiVisaRule {

	@Override
	public boolean followStanderds() {
		return true;
	}

	@Override
	public boolean underStandingConcepts() {
		return true;
	}

	@Override
	public long minAmount() {
		return 7656;
	}

	@Override
	public String stayinHotel() {
		return "shru";
	}

	@Override
	public int maxGoldLimit() {
		return 87657;
	}

	@Override
	public String citizen() {
		return "peoples";
	}

	@Override
	public boolean criminalRecord() {
		return false;
	}

	@Override
	public boolean jail() {
		return false;
	}
	

}
