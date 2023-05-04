package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SoftwareDetail {

	public static void main(String[] args) {

		try {

			System.out.println("Drivere loading sucessfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jdbc", "root",
					"2AG19CV418");

			String querry = "insert into softwareDetail value(1,'IOSoftware','Shruti','student')";

			Statement st = connection.createStatement();
			boolean boo = st.execute(querry);
			System.out.println(boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
