package com.xworkz.collection.functional;

import com.xworkz.collection.util.RunnerUtil;

public class RunnerRunner {

	public static void main(String[] args) {
		
		Runner runner=(distance)->{
			System.out.println("running distance in runner:"+distance);
			return distance;
		};
		RunnerUtil.test(runner);
		
		
	}
	
}
