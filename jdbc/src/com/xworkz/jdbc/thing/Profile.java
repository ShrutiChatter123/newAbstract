package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Profile {

	public static void main(String[] args) {

		try {
			System.out.println("Driver loaded sucessfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_tasks", "root",
					"2AG19CV418");

			String query = "insert into profile value(22,'trayaum',1,'BAMS',234567545)";

			Statement state = connection.createStatement();
			boolean boo = state.execute(query);
			System.out.println("getting from database:"+boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
