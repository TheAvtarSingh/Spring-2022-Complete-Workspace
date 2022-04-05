package org.practice.spring_workout_java_code;


public class CricketPractice implements Coach {
	PlayerFoodDiet playerFoodDiet;
	/*//Backend
	 * PlayerFoodDiet playerFoodDiet;
	 * @Autowired public CricketPractice(@Qualifier("cricketFoodDiet")PlayerFoodDiet
	 * pFD) { this.playerFoodDiet = pFD; }
	 */
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
