package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MovieRunner {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task", "root",
					"2AG19CV418");

			String query = "select * from MovieDetails";
			Statement st = connection.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				System.out.println("id:"+set.getInt(1)+" "+"cost:"+set.getInt(2)+" "+"theater:"+set.getString(3)+" "+"hero:"+set.getString(4));
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
