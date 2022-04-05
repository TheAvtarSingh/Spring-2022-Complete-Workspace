package org.ncu.spring;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SportApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sports name");
		String sp=sc.next();
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coaching=context.getBean(sp,Coach.class);
		coaching.practice("Avtar");
		System.out.println(coaching.getDietPlan());
		
		System.out.println("--------------------");
		
		BasketballPractice bskt = context.getBean(sp,BasketballPractice.class);
	System.out.println("For Basketball Player food conumption is : "+bskt.getFoodConsumption());
	System.out.println("For Basketball Player workout should be : "+bskt.getWorkout());	
		
		
		context.close();
		sc.close();
	}

}
