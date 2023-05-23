package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ComputerRunner {
	public static void main(String[] args) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost::3306/jdbc_tasks", "root",
					"2AG19CV418");
			String querry = "select* from laptop";

			Statement state = connection.createStatement();
			ResultSet set = state.executeQuery(querry);
			ResultSet result = state.getResultSet();

			
			while (set.next()) {
				System.out.println("name:" + set.getString(1) + " " + "int:" + set.getInt(2) + " " + set.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
