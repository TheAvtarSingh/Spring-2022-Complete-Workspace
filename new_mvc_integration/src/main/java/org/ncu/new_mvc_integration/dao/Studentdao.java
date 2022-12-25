package org.ncu.new_mvc_integration.dao;

import java.util.List;

import org.ncu.new_mvc_integration.entity.Student;

public interface Studentdao {
	//Read all students
public List<Student> getStudents();
//Read one student
public Student getStudent(int id);
//Insert Record
public int createRecord(Student stud);
//Update Student
public int updateRecord(Student stud) ;
//Delete Student
public int deleteRecord(int id);
	


}
