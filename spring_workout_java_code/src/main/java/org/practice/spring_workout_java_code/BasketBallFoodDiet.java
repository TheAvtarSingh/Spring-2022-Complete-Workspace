package org.practice.spring_workout_java_code;



public class BasketBallFoodDiet implements PlayerFoodDiet {


		
		public BasketBallFoodDiet() {
			System.out.println("BasketBall Class Bean Created");
		}
		@Override
		public String getFoodDiet() {
			return "Your Have to Consume Vitamins";

		}
}
