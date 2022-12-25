package org.ncu.spring_maven_jdbc_connection_practice;

import java.util.List;

//Data Access Object Class Which will communicate with Database

public interface StudentsDao {

	// DAO is data access object to perform crud operation
	
	//CRUD
	
	//C --- Create
	
	//method for adding a record into the database
	public void insertRecord(Students students);
	
	//method for adding bulk records
	public void insertBatch(List<Students> students);
	
	//R --- Reading
	//Reading all Records
	public List<Students> fetchAllStudents();
	
	//Reading Single Record
	public List<Students> fetchStudentById(int id);
	
	//U --- Update
	//Update Record
	public String updateStudentname(int id,String name);
	
	//D --- Delete
	//Delete All
	public String deleteAllRecords();
	
	//Delete Single
	public String deleteRecord(int id);
	
	
	
	
	
}
