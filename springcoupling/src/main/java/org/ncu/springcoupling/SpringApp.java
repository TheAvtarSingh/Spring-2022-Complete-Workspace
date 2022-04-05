package org.ncu.springcoupling;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your NAME : ");
		String name = sc.next();
		System.out.println("ENter Your Language : ");
		String langString  = sc.next();
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	GreetingService service = context.getBean(langString, GreetingService.class);
	
	// call/invoke the methods of beans
	
	service.greet(name);
	System.out.println(service.getDailyFortune());
	
	// close context
	context.close();
	sc.close();
	}
}
