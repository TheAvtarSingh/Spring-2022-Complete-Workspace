package org.practice.spring_workout_java_code;



public class WrestlingFoodDiet implements PlayerFoodDiet{
public WrestlingFoodDiet() {
	// TODO Auto-generated constructor stub
	System.out.println("Wrestling Class Been Created");
}
	@Override
	public String getFoodDiet() {
		// TODO Auto-generated method stub
		return "You have To Consume Carbohydrates";
	}

}
