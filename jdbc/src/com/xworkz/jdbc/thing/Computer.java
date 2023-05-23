package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Computer {

	public static void main(String[] args) {

		try {

			System.out.println("Loading driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver connection");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost::3306/jdbc_tasks", "root",
					"2AG19CV418");
			System.out.println("Creating querry");
			String querry = "insert into laptop values ('Dell',1234,'highBrand')";

			Statement state = connection.createStatement();
			boolean boo = state.execute(querry);
			System.out.println(boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
