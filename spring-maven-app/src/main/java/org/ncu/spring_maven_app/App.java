package org.ncu.spring_maven_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		employeeDao empdao = context.getBean("employeeDaoImpl", employeeDaoImpl.class);

//		employee emp = context.getBean("employee", employee.class);
//		System.out.println("============ Inserting One Record ==============");
//Insert Single Record
		/*
		 * emp.setEmp_id(102); emp.setEmp_name("Harit"); emp.setEmp_salary(1000);
		 * emp.setEmp_address("Delhi"); empdao.createRecord(emp);
		 */
//		System.out.println("============ Updating Employee Records ==============");
//Updating Records
//		empdao.updateRecord("Sunil",101);
		
		//Insert Bulk
		/*
		employee emp1 = context.getBean("employee", employee.class);
    	employee emp2 = context.getBean("employee", employee.class);
    	employee emp3 = context.getBean("employee", employee.class);
    	employee emp4 = context.getBean("employee", employee.class);
    	
    	emp1.setEmp_id(110);
    	emp1.setEmp_name("Spiderman");
    	emp1.setEmp_salary(50000);
    	emp1.setEmp_address("New York");
    	
    	emp2.setEmp_id(111);
    	emp2.setEmp_name("Ironman");
    	emp2.setEmp_salary(1000000);
    	emp2.setEmp_address("New York");
    	
    	emp3.setEmp_id(112);
    	emp3.setEmp_name("Superman");
    	emp3.setEmp_salary(5000);
    	emp3.setEmp_address("New Jersey");
    	
    	emp4.setEmp_id(114);
    	emp4.setEmp_name("Black Adam");
    	emp4.setEmp_salary(560000);
    	emp4.setEmp_address("Alien Planet");
    	
    	
    	List<employee> empList = new 	ArrayList<employee>();
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	empList.add(emp4);
    	
    	empdao.insertBatchRecords(empList);
		*/
		System.out.println("============ Fetching Employee Records ==============");

		List<employee> employees = empdao.fetchAllRecords();

		for (employee e : employees) {
			System.out.println(e);
		}
		

		System.out.println("============ Deleting Employee Records ==============");
		empdao.deleteRecord(102);

    	System.out.println("======= Fetching record by id ========");
    	System.out.println(empdao.fetchRecordById(101));
    	
    	System.out.println("============ Fetching Employee Records ==============");

		List<employee> employ = empdao.fetchAllRecords();

		for (employee e : employ) {
			System.out.println(e);
		}
    	
    	/*
    	System.out.println("============ Updating Bulk Employee Records ==============");
    	employee emp11 = context.getBean("employee", employee.class);
    	employee emp21 = context.getBean("employee", employee.class);
    	employee emp31 = context.getBean("employee", employee.class);
    	employee emp41 = context.getBean("employee", employee.class);
     	
    	emp11.setEmp_name("Spiderman");
    	emp11.setEmp_id(110);
    	
    	
    	emp21.setEmp_name("Ironman");
    	emp21.setEmp_id(111);
    	
    	
    	emp31.setEmp_name("Superman");
    	emp31.setEmp_id(112);
    	
    	
    	
    	List<employee> empList1 = new ArrayList<employee>();
    	empList1.add(emp11);
    	empList1.add(emp21);
    	empList1.add(emp31);
    	empList1.add(emp41);
    	
    	empdao.updateMultipleRecord(empList1);
    	*/
		
    	System.out.println("============ Fetching Employee Records By Name ==============");

		List<employee> empl = empdao.fetchRecordByName("Spiderman");

		for (employee e : empl) {
			System.out.println(e);
		}
		
		System.out.println("============ Grouping Records By Address ==============");

		List<employee> emplo = empdao.fetchGroupRecords();

		for (employee e : emplo) {
			System.out.println(e);
		}
		
		
		System.out.println("============ Getting specific Grouping Records By Address ==============");

		List<EmployeeSpecific> emploo = empdao.fetchColumnsGroupRecords();

		for (EmployeeSpecific e : emploo) {
			System.out.println(e);
		}
		
		System.out.println("============ Deleting all Records ==============");
		
//		empdao.deleteAllRecords();


		context.close();
	}
}
