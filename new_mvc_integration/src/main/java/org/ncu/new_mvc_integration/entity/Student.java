package org.ncu.new_mvc_integration.entity;

public class Student {
	
	
	
@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
public int studentId;
public String studentName;
public String studentAddress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}


}
