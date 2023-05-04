package com.xworkz.jdbc.thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MovieDetail {

	public static void main(String[] args) {

		try {
			System.out.println("Driver loadede sucessfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jdbc", "root",
					"2AG19CV418");

			String query = "insert into MovieDetails value(1,200,'ranna','homable','sudeep')";

			Statement st = connection.createStatement();
			boolean boo = st.execute(query);
			System.out.println("getting from database:" + boo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
