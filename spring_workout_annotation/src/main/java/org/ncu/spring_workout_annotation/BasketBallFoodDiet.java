package org.ncu.spring_workout_annotation;

import org.springframework.stereotype.Component;

@Component
public class BasketBallFoodDiet implements PlayerFoodDiet {


		
		public BasketBallFoodDiet() {
			System.out.println("BasketBall Class Bean Created");
		}
		@Override
		public String getFoodDiet() {
			return "Your Have to Consume Vitamins";

		}
}
