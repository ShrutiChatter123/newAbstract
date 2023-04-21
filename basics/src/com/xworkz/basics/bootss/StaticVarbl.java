package com.xworkz.basics.bootss;

public class StaticVarbl {

//	instance variable

	String brand;
	int price;
	static String name;

	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}

	public static class demo {

		public static void main(String[] args) {

			StaticVarbl obj1 = new StaticVarbl();
			obj1.brand = "Apple";
			obj1.price = 1500;
			obj1.name = "Smartphone";
			System.out.println(obj1.brand);
			System.out.println(obj1.price);
			System.out.println(obj1.name);

//			this above method indicates usinginitialization with ref

			System.out.println("-----------method initialization---------------");
			StaticVarbl obj2 = new StaticVarbl();
			obj2.brand = "samsung";
			obj2.price = 1700;
			obj2.name = "smartphone";
			System.out.println();
//			instead of this above ref we are using method now

			obj1.name = "phone";
			obj2.show();
			obj1.show();
			System.out.println("---------------only static part-----------------");

			StaticVarbl obj3 = new StaticVarbl();
			obj3.brand = "itole";
			obj3.price = 7865;
			StaticVarbl.name = "iphone";
			System.out.println(obj3.brand);
			System.out.println(obj3.price);
			System.out.println(obj3.name);

//			obj3.show();  this is the method wich is indicate the static initialization with method
//			*staic variable shared by all the obj

			System.out.println("----------------------------");
		}
	}

}
