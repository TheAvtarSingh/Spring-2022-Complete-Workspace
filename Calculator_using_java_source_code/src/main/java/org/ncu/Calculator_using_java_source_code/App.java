package org.ncu.Calculator_using_java_source_code;

import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Calculator adservice = context.getBean("add",Calculator.class);
        Calculator subservice = context.getBean("sub",Calculator.class);
        Calculator multiservice = context.getBean("multi",Calculator.class);
        Calculator divservice = context.getBean("div",Calculator.class);
        Scanner sc = new Scanner(System.in);
  		System.out.print("Enter x : ");
  		int x = sc.nextInt();
  		System.out.println();
  		System.out.println("Enter y : ");
  		int y = sc.nextInt();
  		System.out.println();
  		System.out.println("---------Menu------n---");
  		System.out.println("Enter 1 for Addition");
  		System.out.println("Enter 2 for Subtraction");
  		System.out.println("Enter 3 for Multiplication");
  		System.out.println("Enter 4 for Division");
  		int choice = sc.nextInt();

  		switch (choice) {
  		case 1:
  			adservice.getAddServiceResult(x, y);
  			break;
  		case 2:
  			subservice.getSubServiceResult(x, y);
  			break;
  		case 3:
  			multiservice.getMultiServiceResult(x, y);
  			break;
  		case 4:
  			divservice.getDivServiceResult(x, y);
  			break;
  		default:
  			System.out.println("Wrong Choice Try again Later");
  			break;
  		}
  		sc.close();
  		context.close();
    }
}
