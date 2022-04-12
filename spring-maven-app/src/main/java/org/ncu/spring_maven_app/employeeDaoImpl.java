package org.ncu.spring_maven_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class employeeDaoImpl implements employeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createRecord(employee emp) {
		// TODO Auto-generated method stub
		String query = "insert into employe values(?,?,?,?)";
		Object records[] = { emp.getEmp_id(), emp.getEmp_name(), emp.getEmp_salary(), emp.getEmp_address() };
//update method is used for DML Queries
		jdbcTemplate.update(query, records);
		System.out.println("Record Inserted SucessFully! " + emp.getEmp_name());
	}

	public List<employee> fetchAllRecords() {
		// TODO Auto-generated method stub

		String query = "select * from employe";

//		RowMapper<employee> rowMapper = new employeeRowMapper();

//		
//		List<employee> employees=jdbcTemplate.query(query,rowMapper);

		List<employee> employee = jdbcTemplate.query(query, new BeanPropertyRowMapper<employee>(employee.class));

		return employee;
	}

	public void updateRecord(String name, int id) {
		// TODO Auto-generated method stub
		String sql = "update employe set emp_name= ? where emp_id = ?";
		int check = jdbcTemplate.update(sql, name, id);
		if (check == 1) {
			System.out.println("Record Updated Successfully");
		}

	}

	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employe where emp_id = ? ";

		jdbcTemplate.update(sql, id);

		return null;
	}

	public List<employee> fetchRecordById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from employe where emp_id=?";
		
		  RowMapper<employee> rowMapper = new employeeRowMapper();
		  
		  
		  List<employee> employee=jdbcTemplate.query(sql,rowMapper,id);
		 

		// BeanPropertyRowMapper will only give sor multiple recoords it cannot work for
		// single records
//		List<employee> employee = jdbcTemplate.query(sql, new BeanPropertyRowMapper<employee>(employee.class));
		return employee;
	}

	public void updateMultipleRecord(List<employee> emp) {
		// TODO Auto-generated method stub
		String query = "update employe set emp_name=? where emp_id=?";

		List<Object[]> batchArgs = new ArrayList<Object[]>();

		for (employee employee2 : emp) {
			Object[] args = { employee2.getEmp_name(), employee2.getEmp_id() };
			batchArgs.add(args);
		}

		jdbcTemplate.batchUpdate(query, batchArgs);
	}

	public void insertBatchRecords(List<employee> employees) {
		// TODO Auto-generated method stub
		String query = "insert into employe values (?, ?, ?, ?)";
		List<Object[]> batchArgs = new ArrayList<Object[]>();
		
		for(employee emp : employees) {
			Object[] args = {emp.getEmp_id(), emp.getEmp_name(), emp.getEmp_salary(), emp.getEmp_address()};
			batchArgs.add(args);
		}
		
		jdbcTemplate.batchUpdate(query, batchArgs);
		 System.out.println("Batch insertion successfull!"); 

	}

	public List<employee> fetchRecordByName(String name) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub

        String query="select * from employe where emp_name=?";

       

        List<employee> empList=jdbcTemplate.query(query,new EmployeeResultSetExtractor(),name);

        return empList;
	}

	public boolean deleteAllRecords() {
		// TODO Auto-generated method stub
		String query = "truncate table employe";

		jdbcTemplate.execute(query);
		return false;
	}

	public List<employee> fetchGroupRecords() {
		// TODO Auto-generated method stub
		String sql = "select * from employe group by emp_address";
		
		  RowMapper<employee> rowMapper = new employeeRowMapper();
		  
		  
		  List<employee> employee=jdbcTemplate.query(sql,rowMapper);
		 

		// BeanPropertyRowMapper will only give sor multiple recoords it cannot work for
		// single records
//		List<employee> employee = jdbcTemplate.query(sql, new BeanPropertyRowMapper<employee>(employee.class));
		return employee;
	}

	public List<EmployeeSpecific> fetchColumnsGroupRecords() {
		// TODO Auto-generated method stub
		String sql = "select emp_id,emp_name from employe group by emp_address;";
		


        List<EmployeeSpecific> empList=jdbcTemplate.query(sql,new ResultSetExtractorSpecific());

		// BeanPropertyRowMapper will only give sor multiple recoords it cannot work for
		// single records
//		List<employee> employee = jdbcTemplate.query(sql, new BeanPropertyRowMapper<employee>(employee.class));
		return empList;
	}

}
