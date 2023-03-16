package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.CodingRule;
import com.xworkz.implimentaionInt.thing.SystemsInCode;

public class CodingRuleRunner {

	public static void main(String[] args) {

		SystemsInCode systm = new SystemsInCode();
		boolean safe = systm.safe();
		System.out.println(safe);

		String secure = systm.secure();
		System.out.println(secure);
		boolean realability = systm.reliable();
		System.out.println(realability);
		String tast = systm.tastsble();
		System.out.println(tast);
		double maintain = systm.maintainable();
		System.out.println(maintain);
		double portable = systm.portable();
		System.out.println(portable);
		String compli = systm.complianceWithIndustry();
		System.out.println(compli);
		boolean code = systm.codeQuality();
		System.out.println(code);
		int reduce = systm.reduceAccelerationTime();
		System.out.println(reduce);
		int cost = systm.reduceAccelerationCost();
		System.out.println(cost);
	System.out.println("=============");
		boolean b=systm.codeQuality();
		System.out.println(b);
		boolean s=systm.equals(compli);
		System.out.println(s);
		 int hash=systm.hashCode();	
		System.out.println(hash);
	
		
	
	
		CodingRule rule = new SystemsInCode();
		System.out.println(rule.safe());
		System.out.println(rule.secure());
		System.out.println(rule.reliable());
		System.out.println(rule.tastsble());
		System.out.println(rule.maintainable());
		System.out.println(rule.portable());
		System.out.println(rule.complianceWithIndustry());
		System.out.println(rule.codeQuality());
		System.out.println(rule.reduceAccelerationTime());
		System.out.println(rule.reduceAccelerationCost());
		
		
		Object obj=new SystemsInCode();
		SystemsInCode systemsInCode=(SystemsInCode)obj;
		systemsInCode.getClass();

	}
	

}
