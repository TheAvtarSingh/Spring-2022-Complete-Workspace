package org.ncu.spring_mvc_jdbc_integration.DAO;

import java.util.List;

import org.ncu.spring_mvc_jdbc_integration.Entity.Student;

public interface StudentDAO {
public List<Student> loadStudents();
	
	// method for adding a record into the database
	public int createRecord(Student std);
}
