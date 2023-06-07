package com.xworkz.iskonJdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.iskonJdbc.dto.StudentDTO;
import com.xworkz.iskonJdbc.jdbcutil.JdbcUtil;

public class StudentRepositoryImp implements StudentRepository {

	
	@Override
	public boolean save(StudentDTO dto) throws ClassNotFoundException {
		System.out.println("Runnning save method in StudentRepositoryImp");
		int count = 0;
		
         Class.forName("com.mysql.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName,
					JdbcUtil.password)) {

				String query = "insert into studentDetails values(?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(query);

				System.out.println("query:" + query);
				
				statement.setString(1, dto.getName());
				statement.setString(2, dto.getQualification());
				statement.setString(3, dto.getStream());
				statement.setString(4, dto.getCourse());
				statement.setString(5, dto.getCollege());
				statement.setString(6, dto.getCity());
				statement.setString(7, dto.getState());
				statement.setString(8, dto.getCountry());

				count = statement.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		if(count!=0) {
			return true;
		}
		return false;
}
	
	
	
}
