package org.ncu.spring_workout_annotation;

import org.springframework.stereotype.Component;

@Component
public class CricketFoodDiet implements PlayerFoodDiet {

	
	public CricketFoodDiet() {
		System.out.println("Cricket Class Bean Created");
	}
	@Override
	public String getFoodDiet() {
		return "Your Have to Consume Protein";

	}

}
