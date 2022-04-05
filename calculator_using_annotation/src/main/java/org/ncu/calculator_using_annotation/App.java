package org.ncu.calculator_using_annotation;

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
      Calculator service = context.getBean("calculator",Calculator.class);
      Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.println();
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("---------Menu---------");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			service.getAddServiceResult(x, y);
			break;
		case 2:
			service.getSubServiceResult(x, y);
			break;
		case 3:
			service.getMultiServiceResult(x, y);
			break;
		case 4:
			service.getDivServiceResult(x, y);
			break;
		default:
			System.out.println("Wrong Choice Try again Later");
			break;
		}
		sc.close();
		context.close();
    }
    
}
