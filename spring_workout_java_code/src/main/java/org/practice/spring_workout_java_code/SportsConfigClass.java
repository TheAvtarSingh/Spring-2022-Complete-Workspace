package org.practice.spring_workout_java_code;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:field.properties")


public class SportsConfigClass {
	//Cricket Game
	
//Creating the object of dependency Class of Cricket game
	@Bean
	public PlayerFoodDiet playerFoodDietwrestling() {
		return new WrestlingFoodDiet();
	}
	//Injecting the Dependency Class to dependent class object
	@Bean("wrestling")
	public Coach coachinterfacewrestling() {
		return new WrestlingPractice(playerFoodDietwrestling());
		
	}
	
	//BasketBallGame
	//Object of dependency class
	@Bean
	public PlayerFoodDiet playerFoodDietbasket() {
		return new BasketBallFoodDiet();
	}
	//Dependent Class Injection
	@Bean("basketball")
	public Coach coachinterfacebasketball() {
		return new BasketballPractice(playerFoodDietbasket());
		
	}
	
	//Cricket Game
	
	//Creating the object of dependency Class of Cricket game
		@Bean
		public PlayerFoodDiet playerFoodDietcricket() {
			return new CricketFoodDiet();
		}
		//Injecting the Dependency Class to dependent class object
		@Bean("cricket")
		public Coach coachinterfacecricket() {
			return new CricketPractice(playerFoodDietcricket());
			
		}
}
