package org.ncu.spring_Greeting_Java;

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
    System.out.println("----------------------------------");
    System.out.println("This is done using Constructor Injection ");
    GreetingService service  =  context.getBean("english",GreetingService.class);
    System.out.println(service.greet("Avtar"));
    System.out.println(service.fortunegiver());
    System.out.println("----------------------------------");
    System.out.println("This is done using Setter Injection ");
    GreetingService service2 =  context.getBean("french",GreetingService.class);
    System.out.println(service2.greet("Avtar"));
    System.out.println(service2.fortunegiver());
    System.out.println("----------------------------------");
    System.out.println("This is done using Field / Property Injection ");
    GreetingService service3 =  context.getBean("spanish",GreetingService.class);
    GreetinSpanish spanish = context.getBean("spanish",GreetinSpanish.class);
    System.out.println(service3.greet("Avtar"));
    System.out.println(service3.fortunegiver());
    System.out.println("Day is : "+spanish.getDay());
    System.out.println("Week is : "+spanish.getWeek());
    System.out.println("----------------------------------");

    System.out.println("This will Generate Random Fortune For You");
    GreetingService service31 =  context.getBean("random",GreetingService.class);
    System.out.println(service31.greet("Avtar"));
    System.out.println(service31.fortunegiver());
    System.out.println("----------------------------------");
    context.close();
    }
}
