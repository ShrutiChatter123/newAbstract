package com.xworkz.oopsAbstract.thing;

public class PresentaionDepartment extends ChekingDepartment {

	public void process() {
		System.out.println("In 3 rd stage");
		
	}
	
	public static void main(String[] args) {
		PresentaionDepartment pre=new PresentaionDepartment();
		pre.process();
		pre.endDate();
		pre.investigation();
	}
	

}
