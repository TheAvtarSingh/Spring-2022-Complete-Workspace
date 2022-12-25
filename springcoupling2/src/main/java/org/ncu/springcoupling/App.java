package org.ncu.springcoupling;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

//Dependent class
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your Prefered Language : ");
    	String lang = sc.next();
    	FactoryGreetingService servicefactory = new FactoryGreetingService();
    	GreetingService gService = servicefactory.getGreetingService(lang);
    	gService.greet("John");
    	
    	/*
    	GreetingService service = new GreetingService();
    	if (lang.equals("English")) {
			service.greetEnglish("John");
		}else if (lang.equals("French")) {
			service.greetFrench("John");
		}else {
			service.greetSpanish("John");
		}
    	*/
    }
}
