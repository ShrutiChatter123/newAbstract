package com.xworkz.iskonJdbc.repository;

import com.xworkz.iskonJdbc.dto.StudentDTO;

public interface StudentRepository {

	boolean save(StudentDTO dto) throws ClassNotFoundException ;
}
