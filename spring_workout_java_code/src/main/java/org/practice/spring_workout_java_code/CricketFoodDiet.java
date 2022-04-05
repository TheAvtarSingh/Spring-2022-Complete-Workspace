package org.practice.spring_workout_java_code;


public class CricketFoodDiet implements PlayerFoodDiet {

	
	public CricketFoodDiet() {
		System.out.println("Cricket Class Bean Created");
	}
	@Override
	public String getFoodDiet() {
		return "Your Have to Consume Protein";

	}

}
