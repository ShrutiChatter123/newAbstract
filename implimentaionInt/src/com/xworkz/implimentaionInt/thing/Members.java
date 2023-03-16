package com.xworkz.implimentaionInt.thing;

public class Members implements FamilyRule {

	@Override
	public double wakeUpTime() {
		System.out.println("Running time in  FamilyRule");
		return 6;
	}

	@Override
	public boolean sleepOnTime() {
		System.out.println("Runnin sleep in FamilyRule");
		return false;
	}

	@Override
	public String respectTo() {
		System.out.println("Running respect in FamilyRule");
		return "Seniors";
	}

	@Override
	public String careFor() {
		System.out.println("Runnin carefor in FamilyRule");
		return "others";
	}

	@Override
	public boolean pray() {
		System.out.println("Runnin pray for god in FamilyRule");
		return true;
	}

	@Override
	public boolean beingIndependent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int minMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double lunchTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double breakfastTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean unity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean attendFamilyFunction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double limitTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String friendsMaking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean friendlyWithAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String attendClass() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String toString() {
		return "wakeUpTime"+this.wakeUpTime()+"sleepOnTime"+this.sleepOnTime()+"respectTo"+this.respectTo()
		+"careFor"+this.careFor()+"pray"+this.pray()+"beingIndependent"+this.beingIndependent()
		+"minMembers"+this.minMembers()+"lunchTime"+this.lunchTime()+"breakfastTime"+this.breakfastTime()
		+"unity"+this.unity()+"attendFamilyFunction"+this.attendFamilyFunction()+"limitTime"+this.limitTime()
		+"friendsMaking"+this.friendsMaking()+"friendlyWithAll"+this.friendlyWithAll()+"attendClass+"+this.attendClass();
	}
	
}
