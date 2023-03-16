package com.xworkz.implimentaionInt.thing;

public class FollowersPubRule implements PubRule {

	@Override
	public boolean visitInEvening() {
		System.out.println("Running  visitar in PubRule");
		return false;
	}

	@Override
	public String dressCode() {
		System.out.println("Running dress code in PubRule");
		return "Christmas jumper";
	}

	@Override
	public boolean drinkWaterInPop() {
		System.out.println("Running warerPop in PubRule");
		return true;
	}

	@Override
	public int timingPerHead() {
		System.out.println("Running timing in PubRule");
		return 30;
	}

	@Override
	public boolean pairRule() {
		System.out.println("Running pair rule in PubRule");
		return true;
	}
	@Override
	public String toString() {
		return "visitInEvening"+this.visitInEvening()+"dressCode"+this.dressCode()+"drinkWaterInPop"+this.drinkWaterInPop()
		+"timingPerHead"+this.timingPerHead()+"pairRule"+this.pairRule();
	}

}
