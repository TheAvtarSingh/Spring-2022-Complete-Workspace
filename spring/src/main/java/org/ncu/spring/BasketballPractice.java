package org.ncu.spring;

public class BasketballPractice implements Coach {
	//class fields
	private String foodConsumption;
	private String workout;
	
	public String getFoodConsumption() {
		return foodConsumption;
	}
	public void setFoodConsumption(String foodConsumption) {
		this.foodConsumption = foodConsumption;
	}
	public String getWorkout() {
		return workout;
	}
	public void setWorkout(String workout) {
		this.workout = workout;
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
		return "You Have to Consume Caborhydrates";
	}

}