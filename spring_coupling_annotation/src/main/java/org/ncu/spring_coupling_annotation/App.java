package org.ncu.spring_coupling_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springConfigclass.class);
    	System.out.println("------------------------------------------");
        System.out.println("Using Constructor Injection");
       GreetingService service = context.getBean("englishGreetingService", GreetingService.class);
       service.greet("Avtar");
       System.out.println("Daily Fortune is : "+service.getDailyFortune());
    	System.out.println("------------------------------------------");       
       GreetingService service1 = context.getBean("frenchGreetingService", GreetingService.class);
   	   System.out.println("------------------------------------------");
       System.out.println("Using Setter Injection");
       service1.greet("Avtar");
       System.out.println("Daily Fortune is : "+service1.getDailyFortune());
       System.out.println("------------------------------------------");
       System.out.println("Using Field Injection");
       GreetingService service2 = context.getBean("spanishGreetingService", GreetingService.class);
       SpanishGreetingService service4methods = context.getBean(SpanishGreetingService.class);
       service.greet("Avtar");
       System.out.println("Daily Fortune is : "+service2.getDailyFortune());
       System.out.println("Your Mail Address is "+service4methods.getEmailString());
       System.out.println("Your Address is "+service4methods.getAddressString());
    	System.out.println("------------------------------------------");       
       context.close();
    }
}
