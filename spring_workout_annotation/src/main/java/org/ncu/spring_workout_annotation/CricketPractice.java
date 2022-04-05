package org.ncu.spring_workout_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketPractice implements Coach {
	/*//Backend
	 * 
	 * PlayerFoodDiet playerFoodDiet;
	 * 
	 * @Autowired public CricketPractice(@Qualifier("cricketFoodDiet")PlayerFoodDiet
	 * pFD) { this.playerFoodDiet = pFD; }
	 */
	@Autowired
	@Qualifier("cricketFoodDiet")
	PlayerFoodDiet playerFoodDiet;
	public void practice(String sport) {
		System.out.println("Practice 500 Cover Drives "+sport);
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return playerFoodDiet.getFoodDiet();
	}

}
