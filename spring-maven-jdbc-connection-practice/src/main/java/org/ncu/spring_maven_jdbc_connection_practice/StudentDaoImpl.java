package org.ncu.spring_maven_jdbc_connection_practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentsDao {

	// Only Setter is Required
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertRecord(Students students) {
		// TODO Auto-generated method stub
		String query = "insert into students values(?,?,?,?,?)";

		Object[] records = { students.getStudentrno(), students.getStudentname(), students.getPhonenumber(),
				students.getStudentaddress(), students.getModeoftransport() };

		// For DML update is used

		jdbcTemplate.update(query, records);

		System.out.println("Records Inserted Successfully");
	}

	public void insertBatch(List<Students> students) {
		// TODO Auto-generated method stub
		String query = "insert into students values(?,?,?,?,?)";

		List<Object[]> batchArgs = new ArrayList<Object[]>();

		for (Students student : students) {
			Object[] args = { student.getStudentrno(), student.getStudentname(), student.getPhonenumber(),
					student.getStudentaddress(), student.getModeoftransport() };
			batchArgs.add(args);

		}
		// For DML Update is used
		     jdbcTemplate.batchUpdate(query, batchArgs);
		     
		     
		     
	}

	public List<Students> fetchAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from students";

		RowMapper<Students> rowMapper = new StudentRowMapper();
		// For DDL .query is used
		List<Students> students = jdbcTemplate.query(query, rowMapper);

		return students;
	}

	public List<Students> fetchStudentById(int id) {
		// TODO Auto-generated method stub
		String query = "select * from students where studentrno=?";

		RowMapper<Students> rowMapper = new StudentRowMapper();

		List<Students> students = jdbcTemplate.query(query, rowMapper,id);

		return students;
	}

	public String updateStudentname(int id,String name) {
		// TODO Auto-generated method stub
		String query = "update students set studentname = ? where studentrno=?";
		
		//For DML use Update
		
		int check = jdbcTemplate.update(query,name,id);
		
		if (check==1) {
			return  "Name Updated SucessFully";
		}
		else {
			return "Error Occured in Updating record";
		}
		
	}

	public String deleteAllRecords() {
		// TODO Auto-generated method stub
		String query = "truncate table students";
		

		int check = jdbcTemplate.update(query);
		
		if (check==1) {
			return  "Table Deleted SucessFully";
		}
		else {
			return "Error Occured in Deleting Table";
		}
		
	}

	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		String sql="delete from students where studentrno=?";

		int check = jdbcTemplate.update(sql,id);
		
		if (check==1) {
			return  "Record Deleted SucessFully";
		}
		else {
			return "Error Occured in Deleting record";
		}
	}

}
