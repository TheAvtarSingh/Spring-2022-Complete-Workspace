package org.ncu.spring_maven_jdbc_connection_practice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Students>{

	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Students students = new Students();
		//It Gives One Row at one invocation and Return that but in resultSetExtractor it extract complete data and store it in List
		
		students.setStudentrno(rs.getInt("studentrno"));
		students.setStudentname(rs.getString("studentname"));
		students.setPhonenumber(rs.getInt("phonenumber"));
		students.setStudentaddress(rs.getString("studentaddress"));
		students.setModeoftransport(rs.getString("modeoftransport"));
		
		return students;
	}

}
