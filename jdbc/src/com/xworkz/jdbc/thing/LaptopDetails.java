package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LaptopDetails {

	public static void main(String[] args) {

		try {
			System.out.println("Sucessfully loaded driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jdbc", "root",
					"2AG19CV418");

			String query = "insert into LoptopDetails values(1,'dell','high','trayaum',3456789754) ";

			Statement st = connection.createStatement();
			boolean b = st.execute(query);
			System.out.println("getting from database:" + b);

		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}