package org.ncu.spring_maven_app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class employeeRowMapper implements RowMapper<employee>{

	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		employee empl=new employee();
		empl.setEmp_id(rs.getInt("emp_id"));
		empl.setEmp_name(rs.getString("emp_name"));
		empl.setEmp_salary(rs.getInt("emp_salary"));
		empl.setEmp_address(rs.getString("emp_address"));
		
		return empl;
	}

}
