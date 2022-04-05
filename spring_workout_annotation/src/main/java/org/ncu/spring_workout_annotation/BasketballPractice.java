package org.ncu.spring_workout_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class BasketballPractice implements Coach {
	public BasketballPractice() {
		System.out.println("Constructor of Basket Ball Practice");
	}
	
	//Set Interface object
	private PlayerFoodDiet pFoodDiet;
	@Autowired
	@Qualifier("basketBallFoodDiet")
	
	//Setter Method
	public void setpFoodDiet(PlayerFoodDiet Playerfood) {
		this.pFoodDiet = Playerfood;
	}
/*
	PlayerFoodDiet playerFoodDiet;
	public BasketballPractice(PlayerFoodDiet pFD) {
		this.playerFoodDiet = pFD;
	}
	*/
	public void practice(String sport) {
		System.out.println("practice 300 up downs "+sport);
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return pFoodDiet.getFoodDiet();
	}
	@PostConstruct
	public void doInitilizationStuff() {
		// TODO Auto-generated method stub
		System.out.println("Initilization of BasktetBall Lifecycle");

	}
	@PreDestroy
	public void doDestructionStuff() {
		// TODO Auto-generated method stub
				System.out.println("Destruction of BasktetBall Lifecycle");

	}

}