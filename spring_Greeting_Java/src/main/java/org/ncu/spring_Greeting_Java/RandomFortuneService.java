package org.ncu.spring_Greeting_Java;

import java.util.Random;

public class RandomFortuneService implements FortuneServce {
	 String[] Fortunes = new String[]{"Today is your lucky day","You will be Blessed","You will experience Happiness","You will meet new people","You will get good Food to eat"};

	   
	    
	@Override
	public String Fortune() {
		// TODO Auto-generated method stub
		 Random rand = new Random();
	       
		return Fortunes[rand.nextInt(Fortunes.length)];
	}

}
