package org.ncu.spring_workout_annotation;

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
        // Create a spring container
    	//ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfigClass.class);
    	System.out.println("With Constructor Injection : ");
        Coach cricketgame = context.getBean("cricketPractice",Coach.class);
    	cricketgame.practice("Avtar");
    	
    	System.out.println("Food Diet is :  "+cricketgame.getDietPlan());
    	System.out.println("-----------------------------------------");
    	System.out.println("With Setter Injection : ");
        Coach basketballgame = context.getBean("basketballPractice",Coach.class);
 		basketballgame.practice("Avtar");
 	
      	System.out.println("Food Diet is :  "+basketballgame.getDietPlan());
 	
    	System.out.println("------------------------------------------");

	    System.out.println("With Field Injection : ");
	    Coach wrestlingame = context.getBean("wrestlingPractice",Coach.class);
	    WrestlingPractice wptPractice = context.getBean("wrestlingPractice",WrestlingPractice.class);
	    wrestlingame.practice("Avtar");

        System.out.println("Food Diet is :  "+wrestlingame.getDietPlan());
        System.out.println("Running : "+wptPractice.getRunning());
        System.out.println("Walking : "+wptPractice.getWalking());
        System.out.println("------------------------------------------");
    	// close the context
    	context.close();
    }
}
