package com.xworkz.implimentaionInt.thing;

public class Peoples implements HospitalRule {

	@Override
	public boolean workingwithPeople() {
		System.out.println("Running workingwithPeople in hopitalRule");
		return true;
	}

	@Override
	public String behaviour() {
		System.out.println("Running behaviour in  HospitalRule");
		return "Patients";
	}

	@Override
	public boolean caring() {
		System.out.println("Running caring in HospitalRule");
		return true;
	}

	@Override
	public boolean dontTouchEquipments() {
		System.out.println("Running donttouch in HospitalRule");
		return true;
	}

	@Override
	public boolean dontTouchBeds() {
		System.out.println("Running beds in HospitalRule");
		return true;
	}

	@Override
	public String dontUsePlastic() {
		System.out.println("Running plastic use in HospitalRule");
		return "EnvoirnmentFriendly";
	}

	@Override
	public boolean unnecessaryArguments() {
		System.out.println("Running arguments in HospitalRule");
		return true;
	}

	@Override
	public String cleanEnvoirnment() {
		System.out.println("Running clean in HospitalRule");
		return "health purpose";
	}

	@Override
	public double montlySalaryToWorkers() {
		System.out.println("Running salary in HospitalRule");
		return 45675.55D;
	}

	@Override
	public String cardValidation() {
		System.out.println("Running caed in HospitalRule");
		return "GovernmentRelated";
	}
	@Override
	public String toString() {
		return "workingwithPeople"+this.workingwithPeople()+"behaviour"+this.behaviour()+"caring"+this.caring()
		+"dontTouchEquipments"+this.dontTouchEquipments()+"dontTouchBeds"+this.dontTouchBeds()+"dontUsePlastic"+this.dontUsePlastic()
		+"unnecessaryArguments"+this.unnecessaryArguments()+"cleanEnvoirnment"+this.cleanEnvoirnment()
		+"montlySalaryToWorkers"+this.montlySalaryToWorkers()+"cardValidation"+this.cardValidation();
	}

}
