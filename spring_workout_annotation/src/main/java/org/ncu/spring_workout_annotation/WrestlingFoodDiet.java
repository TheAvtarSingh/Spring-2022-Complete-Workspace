package org.ncu.spring_workout_annotation;

import org.springframework.stereotype.Component;

@Component
public class WrestlingFoodDiet implements PlayerFoodDiet{

	@Override
	public String getFoodDiet() {
		// TODO Auto-generated method stub
		return "You have To Consume Carbohydrates";
	}

}
