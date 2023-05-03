package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class IceCreamDetails {

	public static void main(String[] args) {

		try {
			System.out.println("driver is loded sucessfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting the connection from the driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost::3306/jdbc_tasks", "root",
					"2AG19CV418");

			String query = "insert into iceCreamDetails value(1,'ravana','ms',30,'male');";

			System.out.println("creating query");
			Statement st = connection.createStatement();
			boolean boo = st.execute(query);
			System.out.println("return from database:" + boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
