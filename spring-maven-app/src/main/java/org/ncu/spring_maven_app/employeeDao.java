package org.ncu.spring_maven_app;

import java.util.List;


//Data Access Object Class Which will communicate with Database
public interface employeeDao {
	
	// DAO is data access object
		//to perform crud operation
		
		//method for adding a record into the database
		public void createRecord(employee emp);
		

		// batch insertion
		public void insertBatchRecords(List<employee> employees);
		
		//method for reading a record
		public List<employee> fetchAllRecords();
		
		//method for updating a record in the database
		public void updateRecord(String name,int id);
		
		//method for updating bulk records in the database
		public void updateMultipleRecord(List<employee> employee);
		
		//method for deleting a record from the database
		public String deleteRecord(int id);
		
		//method to fetch a record by ID
		public List<employee> fetchRecordById(int id);
		
		public List<employee> fetchRecordByName(String name);
		
		public boolean deleteAllRecords();
		
		public List<employee> fetchGroupRecords();
		
		public List<EmployeeSpecific> fetchColumnsGroupRecords();
}
