package org.practice.spring_workout_java_code;

import org.springframework.beans.factory.annotation.Value;

public class WrestlingPractice implements Coach{

	PlayerFoodDiet playerFoodDiet;
	
	public WrestlingPractice(PlayerFoodDiet pFoodDiet) {
		this.playerFoodDiet = pFoodDiet;
	}
	
//This is Done Using Field Injection
	
	//Class Fields which we are going to get using Field.properties
	@Value("${walking}")
//	@Value("3 hours")
	private String walking;


	public String getWalking() {
		return walking;
	}

	public String getRunning() {
		return running;
	}

	@Value("${running}")
//	@Value("2 hours")
	private String running;

	/*
	 * public void setWalking(String walking) { this.walking = walking; }
	 * 
	 * 
	 * public void setRunning(String running) { this.running = running; }
	 * 
	 * public String getRunning() { return running; }
	 * 
	 * 
	 * public String getWalking() { return walking; }
	 * 
	 */	@Override
	public void practice(String sport) {
		System.out.println("You have to do Weight Lifting");
		
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return playerFoodDiet.getFoodDiet();
	}

}
