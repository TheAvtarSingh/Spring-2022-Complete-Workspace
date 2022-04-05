package org.ncu.spring;

public class WrestlingPractice implements Coach {
	PlayerFoodDiet playerFoodDiet;
	public void practice(String sport) {
		System.out.println("Practice 100 pushups "+sport);
	}

	public void setPlayerFoodDiet(PlayerFoodDiet pFD) {
		this.playerFoodDiet = pFD;
	}
	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return playerFoodDiet.getFoodDiet();
	}

}
