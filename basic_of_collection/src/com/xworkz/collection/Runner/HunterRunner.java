package com.xworkz.collection.Runner;

import com.xworkz.collection.functional.Hunter;
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
