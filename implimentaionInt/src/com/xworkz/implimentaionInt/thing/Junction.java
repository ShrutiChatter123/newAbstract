package com.xworkz.implimentaionInt.thing;

public class Junction implements RailwayStation {

	@Override
	public String loudSound() {
		System.out.println("Running loudSound in RailwayStation");
		return "HightHudz";
	}

	@Override
	public boolean luggage() {
		System.out.println("Running luggage in RailwayStation");
		return true;
	}

	@Override
	public boolean middleBerth() {
		System.out.println("Running middleBirth in RailwayStation");
		return false;
	}

	@Override
	public String chainPulling() {
		System.out.println("Running chainPulling in RailwayStation");
		return "Emergency";
	}

	@Override
	public boolean journeyExtension() {
		System.out.println("Running Journey in RailwayStation");
		return true;
	}

	@Override
	public int afterTimeRule() {
		System.out.println("Running timeRule in RailwayStation");
		return 10;
	}

	@Override
	public String twoStationBoarding() {
		System.out.println("Running boarding in RailwayStation");
		return "Reserved Tickets";
	}

	@Override
	public double waitListTicket() {
		System.out.println("Running tickets in RailwayStation");
		return 660.55D;
	}
	@Override
	public String toString() {
		return "loudSound"+this.loudSound()+"luggage"+this.luggage()+"middleBerth"+this.middleBerth()
		+"chainPulling"+this.chainPulling()+"journeyExtension"+this.journeyExtension()
		+"afterTimeRule"+this.afterTimeRule()+"twoStationBoarding"+this.twoStationBoarding()
		+"waitListTicket"+this.waitListTicket();
	}

}
