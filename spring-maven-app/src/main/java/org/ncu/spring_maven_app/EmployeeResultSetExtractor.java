package org.ncu.spring_maven_app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;



public class EmployeeResultSetExtractor implements ResultSetExtractor<List<employee>> {



public List<employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
// TODO Auto-generated method stub

List<employee> empList=new ArrayList<employee>();


while(rs.next()) {
employee employee=new employee();



employee.setEmp_id(rs.getInt("emp_id"));   

employee.setEmp_name(rs.getString("emp_name")); 
employee.setEmp_salary(rs.getInt("emp_salary"));   
employee.setEmp_address(rs.getString("emp_address"));    
empList.add(employee);
}

return empList;
}



}