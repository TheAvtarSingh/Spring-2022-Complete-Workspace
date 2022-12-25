package rowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.new_mvc_integration.entity.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentId(rs.getInt("studentId"));
		student.setStudentName(rs.getString("studentName"));
		student.setStudentAddress(rs.getString("studentAddress"));
		return student;
	}

}
