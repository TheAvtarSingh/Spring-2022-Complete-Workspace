package org.ncu.new_mvc_integration.dao;

import java.util.List;

import org.ncu.new_mvc_integration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import rowMappers.StudentRowMapper;

@Repository
public class Studentdaoimpl implements Studentdao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub

		String query = "SELECT * FROM student";
		List<Student> theListOfStudents = jdbcTemplate.query(query, new StudentRowMapper());
		return theListOfStudents;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM student where studentId = ?";
		Student student = jdbcTemplate.queryForObject(query, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public int createRecord(Student stud) {
		// TODO Auto-generated method stub
		String query = "insert into student values(?,?,?)";
		Object records[] = {stud.getStudentId(),stud.getStudentName(),stud.getStudentAddress()};
		int rec = jdbcTemplate.update(query,records);
		return rec;
	}

	@Override
	public int updateRecord(Student stud) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRecord(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
