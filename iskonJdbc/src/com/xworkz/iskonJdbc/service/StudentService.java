package com.xworkz.iskonJdbc.service;

import com.xworkz.iskonJdbc.dto.StudentDTO;

public interface StudentService {

	boolean validThenSave(StudentDTO dto) throws ClassNotFoundException ;
}
