package org.practice.practiceproject;

public class GoToBed implements TimeSchedulerInterface {

	@Override
	public void Worker(String name) {
		System.out.println("Its time to go to Bed : "+name);
		
	}

}
