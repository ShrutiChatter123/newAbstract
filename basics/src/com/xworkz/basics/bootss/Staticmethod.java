package com.xworkz.basics.bootss;

public class Staticmethod {

	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand+" : " + price + " : "+ name);
	}
	
	
	public static void show1(Staticmethod obj) {
		
		System.out.println(obj.brand+ " : " + obj.price+ " : "+ obj.name);
	}
	
	public static class demp{
		
		public static void main(String[] a) {
			Staticmethod obj1=new Staticmethod();
			obj1.brand="Apple";
			obj1.price=13222;
			Staticmethod.name="smartphone";
			obj1.show();
			
			System.out.println("--------------------------");
			Staticmethod obj2=new Staticmethod();
			obj2.brand="Apple";
			obj2.price=13222;
			Staticmethod.name="smartphone";
			
//			if you are changing ur demo
			Staticmethod.name="toutchscreen";
			obj2.show();
			
			
			

			
			}
	}
	
}
