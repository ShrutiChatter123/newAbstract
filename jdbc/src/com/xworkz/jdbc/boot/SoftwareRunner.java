package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SoftwareRunner {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task", "root",
					"2AG19CV418");

			String query = "select* from softwareDetail";

			Statement st = conect.createStatement();
			ResultSet set = st.executeQuery(query);

			while (set.next()) {

				System.out.println("id:" + set.getInt(1) + " " + "name:" + set.getString(2) + " " + "userName:"
						+ set.getString(3) + " " + "role:" + set.getString(4));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
