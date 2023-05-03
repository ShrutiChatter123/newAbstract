package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProfileRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task", "root",
					"2AG19CV418");

			String querry ="select* from profile";

			Statement state = conn.createStatement();
			ResultSet res = state.executeQuery(querry);
			
			while(res.next()) {
				System.out.println("age:"+res.getInt(1)+" "+" name:"+res.getString(2)+" "+"id"+res.getInt(3)+" "+"graduation:"+res.getString(4)+" "+ "MobileNo:"+res.getLong(5));
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
