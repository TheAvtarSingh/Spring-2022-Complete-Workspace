package org.ncu.spring_maven_app;

public class employee {
	
	@Override
	public String toString() {
		return "employee [id=" + emp_id + ", name=" + emp_name + ", salary=" + emp_salary + ", address=" + emp_address + "]";
	}
	
	
private int emp_id;
private String emp_name;
private int emp_salary;
private String emp_address;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public int getEmp_salary() {
	return emp_salary;
}
public void setEmp_salary(int emp_salary) {
	this.emp_salary = emp_salary;
}
public String getEmp_address() {
	return emp_address;
}
public void setEmp_address(String emp_address) {
	this.emp_address = emp_address;
}


}
