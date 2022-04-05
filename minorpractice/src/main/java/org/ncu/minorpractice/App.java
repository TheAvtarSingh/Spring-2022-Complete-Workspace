package org.ncu.minorpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * FactoryClass fClass = new FactoryClass(); GreetingService service =
		 * fClass.getService("english"); service.greet("john");
		 */
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	System.out.println("---------------------------------------------");
    	System.out.println("English Fortune USing Constructor Injection : ");
    	System.out.println("FortuneInEnglish - Dependency");
    	System.out.println("EnglishGreetingService - Dependent");
    	System.out.println("Dependency is injected into Dependent Class");
    	GreetingService service = context.getBean("english",GreetingService.class);
    	service.greet("john");
    	System.out.println(service.myFortune());
    	context.close();
    	System.out.println("---------------------------------------------");
    	ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
    	System.out.println("Spanish Fortune USing Setter Injection : ");
    	System.out.println("FortuneInSpanish - Dependency");
    	System.out.println("SpanishGreetingService - Dependent");
    	System.out.println("Dependency is injected into Dependent Class");
    	GreetingService service1 = context1.getBean("french",GreetingService.class);
    	service1.greet("avtar");
    	System.out.println(service.myFortune());
    	context1.close();
    }
}
