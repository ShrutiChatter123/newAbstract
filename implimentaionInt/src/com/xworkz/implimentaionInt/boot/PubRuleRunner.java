package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.FollowersPubRule;
import com.xworkz.implimentaionInt.thing.PubRule;

public class PubRuleRunner {

	public static void main(String[] args) {
		FollowersPubRule follow = new FollowersPubRule();
		boolean visit = follow.visitInEvening();
		System.out.println(visit);
		String str = follow.dressCode();
		System.out.println(str);
		boolean water = follow.drinkWaterInPop();
		System.out.println(water);
		int timing = follow.timingPerHead();
		System.out.println(timing);
		boolean pair = follow.pairRule();
		System.out.println(pair);
		int hashcode = follow.hashCode();
		System.out.println(hashcode);
		String to = follow.toString();
		System.out.println(to);
	
		
		PubRule roo=new FollowersPubRule();
		System.out.println(roo.visitInEvening());
		System.out.println(roo.dressCode());
		System.out.println(roo.drinkWaterInPop());
		System.out.println(roo.timingPerHead());
		System.out.println(roo.pairRule());
		

	}

}
