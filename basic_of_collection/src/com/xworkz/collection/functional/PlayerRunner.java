package com.xworkz.collection.functional;

import com.xworkz.collection.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player=(name,state)->{
			System.out.println("player name upperCcase:"+name.toUpperCase());
			System.out.println("player name in lowercase:"+name.toLowerCase());
			System.out.println("name and state:"+name+" "+ state);
			return null;
		};
		PlayerUtil.test(player);
	}
	
}
