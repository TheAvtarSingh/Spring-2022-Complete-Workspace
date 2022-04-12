package org.ncu.spring_maven_app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ResultSetExtractorSpecific implements ResultSetExtractor<List<EmployeeSpecific>> {



public List<EmployeeSpecific> extractData(ResultSet rs) throws SQLException, DataAccessException {
// TODO Auto-generated method stub

List<EmployeeSpecific> empList=new ArrayList<EmployeeSpecific>();


while(rs.next()) {
EmployeeSpecific employee=new EmployeeSpecific();



employee.setEmp_id(rs.getInt("emp_id"));   

employee.setEmp_name(rs.getString("emp_name")); 
   
empList.add(employee);
}

return empList;
}
}



