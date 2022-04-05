package org.ncu.spring;

public class CricketPractice implements Coach {
	PlayerFoodDiet playerFoodDiet;
	public CricketPractice(PlayerFoodDiet pFD) {
		this.playerFoodDiet = pFD;
	}
	public void practice(String sport) {
		System.out.println("Practice 500 Cover Drives "+sport);
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return playerFoodDiet.getFoodDiet();
	}

}
