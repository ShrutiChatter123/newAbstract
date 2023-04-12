package com.xworkz.collection.functional;

import com.xworkz.collection.util.Util;

public class HunterRunner {

	public static void main(String[] args) {
		//implicit
		Hunter hunter=((f)->{
			System.out.println("running hunt in hunter:"+f);
		});
		Util.test(hunter);
		
		
		//explicit
		Util.test((f)->{
			System.out.println("running hunt in above method:"+f);
		});
		
	}
}
