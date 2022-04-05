package org.practice.practiceproject;

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
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Current Day Timings : ");
    	String time = sc.next();
    	System.out.println("Enter your name : ");
    	String name = sc.next();
    	//Creating beans
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//Retrieve the beans
    	TimeSchedulerInterface timeSch = context.getBean(time,TimeSchedulerInterface.class);
    	timeSch.Worker(name);
    	//Closing :
    	sc.close();
    	context.close();
       
    	
    }
}
