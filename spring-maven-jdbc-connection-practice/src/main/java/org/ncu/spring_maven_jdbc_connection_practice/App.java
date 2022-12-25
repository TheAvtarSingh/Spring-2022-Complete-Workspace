package org.ncu.spring_maven_jdbc_connection_practice;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	StudentsDao studentsDao = context.getBean("studentsDaoImpl",StudentDaoImpl.class);
    	
    	Students students = context.getBean("students",Students.class);
    	

		System.out.println("============ Deleting All Records ==============");
		
		studentsDao.deleteAllRecords();
    	

		System.out.println("============ Inserting One Record ==============");
		
		students.setStudentrno(100);
		students.setStudentname("Avtar Singh");
		students.setPhonenumber(98765431);
		students.setStudentaddress("New Delhi");
		students.setModeoftransport("Car");
		studentsDao.insertRecord(students);
		

    	
    	System.out.println("============ Inserting Records ==============");
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter number of records you wanna enter : ");
    	int n = sc.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter Roll Number of Student "+(i+1)+" : " );
    		int rno_i = sc.nextInt();
    		students.setStudentrno(rno_i);
    		
    		System.out.println("Enter Name of Student "+(i+1)+" : " );
    		String name_i = sc.next();
            students.setStudentname(name_i);
            
    		System.out.println("Enter Phone Number of Student "+(i+1)+" : " );
    		int num_i = sc.nextInt();
    		students.setPhonenumber(num_i);
    		
    		System.out.println("Enter Address of Student "+(i+1)+" : " );
    		String add_i = sc.next();
    		students.setStudentaddress(add_i);
    		
    		System.out.println("Enter Mode of Transport of Student "+(i+1)+" : " );
    		String mode_i = sc.next();
    		students.setModeoftransport(mode_i);
    		studentsDao.insertRecord(students);
    		
    	}
    	
    	
		System.out.println("============ Fetching All Records ==============");

		List<Students> students1 = studentsDao.fetchAllStudents();

		for (Students e : students1) {
			System.out.println(e);
		}
		

    	System.out.println("======= Fetching record by id ========");
    	System.out.println(studentsDao.fetchStudentById(101));
    	

		System.out.println("============ Deleting All Records ==============");
		
		studentsDao.deleteAllRecords();
		
		System.out.println("============ Fetching All Records ==============");

		List<Students> students11 = studentsDao.fetchAllStudents();

		for (Students e : students11) {
			System.out.println(e);
		}


    	
    }
}
