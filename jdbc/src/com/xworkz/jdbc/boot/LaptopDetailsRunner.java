package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LaptopDetailsRunner {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task", "root", "2AG19CV418");

			String query = "select* from LoptopDetails";

			Statement st = connection.createStatement();
			ResultSet set = st.executeQuery(query);

			while (set.next()) {
				System.out.println("no:" + set.getInt(1) + " " + "name:" + set.getString(2) + " " + "brand:"
						+ set.getString(3) + " " + "ownerName:" + set.getString(4) + " " + "mobileNo" + set.getLong(5));
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
