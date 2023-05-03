package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OsDetails {

	public static void main(String[] args) {

		try {

			System.out.println("loading driver sucessfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting connection from driverManager");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task ", "root",
					"2AG19CV418");

			String query = "insert into OsDetail value(1,2,'software',2300)";

			Statement st = connection.createStatement();
			boolean boo = st.execute(query);
			System.out.println("getting from database:" + boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
