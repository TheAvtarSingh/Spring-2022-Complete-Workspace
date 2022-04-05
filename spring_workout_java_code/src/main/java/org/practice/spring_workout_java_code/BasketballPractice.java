package org.practice.spring_workout_java_code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class BasketballPractice implements Coach {

	PlayerFoodDiet playerFoodDiet;

	public BasketballPractice(PlayerFoodDiet pFD) {
		this.playerFoodDiet = pFD;
	}

	// Setter Method
	public void setpFoodDiet(PlayerFoodDiet Playerfood) {
		this.playerFoodDiet = Playerfood;

	}

	public void practice(String sport) {
		System.out.println("practice 300 up downs " + sport);
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return playerFoodDiet.getFoodDiet();
	}
	
    @PostConstruct 
    public void doInitilizationStuff() { 
		  // TODO Auto-generated
	      System.out.println("Initilization of BasktetBall Lifecycle");
	  
	  }
	 
	 @PreDestroy
	 public void doDestructionStuff() { 
		  // TODO Auto-generated  
		  System.out.println("Destruction of BasktetBall Lifecycle");
	  
	  }
	 

}