package org.practice.spring_workout_java_code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
    	System.out.println("------------------------------------------");
    	System.out.println("Cricket Game");
    	System.out.println("With Constructor Injection : ");
        Coach cricketgame = context.getBean("cricket",Coach.class);
    	cricketgame.practice("Avtar");
    	
    	System.out.println("Food Diet is :  "+cricketgame.getDietPlan());
    	System.out.println("-----------------------------------------");
    	System.out.println("BasketBall Game");
    	System.out.println("With Setter Injection : ");
        Coach basketballgame = context.getBean("basketball",Coach.class);
 		basketballgame.practice("Avtar");
 	
      	System.out.println("Food Diet is :  "+basketballgame.getDietPlan());
 	
    	System.out.println("------------------------------------------");
    	System.out.println("Wrestling Game");
	    System.out.println("With Field Injection : ");
	    Coach wrestlingame = context.getBean("wrestling",Coach.class);
	    WrestlingPractice wptPractice = context.getBean("wrestling",WrestlingPractice.class);
	    wrestlingame.practice("Avtar");

        System.out.println("Food Diet is :  "+wrestlingame.getDietPlan());
        System.out.println("Running : "+wptPractice.getRunning());
        System.out.println("Walking : "+wptPractice.getWalking());
        System.out.println("------------------------------------------");
    	// close the context
    	context.close();
    }
}
