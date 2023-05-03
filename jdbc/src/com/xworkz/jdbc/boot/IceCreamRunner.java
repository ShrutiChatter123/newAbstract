package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IceCreamRunner {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Connection connection = DriverManager.getConnection("jdbc://localhost:3306/jdbc", "root", "2AG19CV418");
			String query = "select * from iceCreamDetails";
			Statement st = connection.createStatement();
			ResultSet result = st.executeQuery(query);
			ResultSet resultset = st.getResultSet();

			while (result.next()) {
				System.out.println("id:" + result.getInt(1) + " " + "" + "name:" + result.getString(2) + " "
						+ " education:" + result.getString(3) + " " + "age:" + result.getInt(4) + " " + "gender:"
						+ result.getString(5));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		}
	}

