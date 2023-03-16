package com.xworkz.implimentaionInt.thing;

public class SystemsInCode implements CodingRule {

	@Override
	public boolean safe() {
		System.out.println("Running safe in CodingRule ");
		return true;
	}

	@Override
	public String secure() {
		System.out.println("Running secure in CodingRule");
		return "cyber";
	}

	@Override
	public boolean reliable() {
		System.out.println("Running realiable in CodingRule");
		return true;
	}

	@Override
	public String tastsble() {
		System.out.println("Running tastsble in CodingRule");
		return "Testers";
	}

	@Override
	public double maintainable() {
		System.out.println("Running maintainable in CodingRule");
		return 77.88D;
	}

	@Override
	public double portable() {
		System.out.println("Running portable in CodingRule");
		return 8.77D;
	}

	@Override
	public String complianceWithIndustry() {
		System.out.println("Running complianceWithIndustry in CodingRule  ");
		return "Guidlince";
	}

	@Override
	public boolean codeQuality() {
		System.out.println("Running codeQuality in CodingRule");
		return true;
	}

	@Override
	public int reduceAccelerationTime() {
		System.out.println("Running reduceAccelerationTime in CodingRule ");
		return 5675;
	}

	@Override
	public int reduceAccelerationCost() {
		System.out.println("Running reduceAccelerationCost in CodingRule ");
		return 444;
	}

	@Override
	public String toString() {
		return "[Safe" + this.safe() + "][Secure" + this.secure() + "reliable" + this.reliable() + "tastsble"
				+ this.tastsble() + "maintainable" + this.maintainable() + "portable" + this.portable()
				+ "complianceWithIndustry" + this.complianceWithIndustry() + "codeQuality" + this.codeQuality()
				+ "reduceAccelerationTime" + this.reduceAccelerationTime() + "reduceAccelerationCost"
				+ this.reduceAccelerationCost();

	}

}
