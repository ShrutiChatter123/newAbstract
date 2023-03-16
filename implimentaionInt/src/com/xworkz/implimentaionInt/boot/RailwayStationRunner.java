package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.Junction;
import com.xworkz.implimentaionInt.thing.RailwayStation;

public class RailwayStationRunner {

	public static void main(String[] args) {

		Junction junc = new Junction();
		String loud = junc.loudSound();
		System.out.println(loud);
		boolean luggage = junc.luggage();
		System.out.println(luggage);
		boolean middbirth = junc.middleBerth();
		System.out.println(middbirth);
		String chain = junc.chainPulling();
		System.out.println(chain);
		boolean journey = junc.journeyExtension();
		System.out.println(journey);
		int no = junc.afterTimeRule();
		System.out.println(no);
		String bording = junc.twoStationBoarding();
		System.out.println(bording);
		double ticket = junc.waitListTicket();
		System.out.println(ticket);
		int hashcode = junc.hashCode();
		System.out.println(hashcode);
		String st = junc.toString();
		System.out.println(st);
		
		String s1="hello";
		String s2="hello";
		boolean ref=s1.equals(s2);
		System.out.println(ref);
		 boolean tr=junc.equals(s2);
		System.out.println(tr);
		junc.getClass();
		System.out.println(junc.getClass());
		
	
		RailwayStation stn=new Junction();
		System.out.println(stn.loudSound());
		System.out.println(stn.luggage());
		System.out.println(stn.middleBerth());
		System.out.println(stn.chainPulling());
		System.out.println(stn.journeyExtension());
		System.out.println(stn.afterTimeRule());
		System.out.println(stn.twoStationBoarding());
		System.out.println(stn.waitListTicket());
		
		

	}

}
