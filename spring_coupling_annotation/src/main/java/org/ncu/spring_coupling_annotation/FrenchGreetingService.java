package org.ncu.spring_coupling_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService {

	@Autowired
	@Qualifier("happyFortuneServiceFrench")
	FortuneService fortuneService;
	
	/*
	 * //Define Setter public FrenchGreetingService(FortuneService fservice) {
	 * 
	 * this.fortuneService = fservice; }
	 */
	 
	@Override
	public void greet(String name) {
		System.out.println("Hello : "+name);

	}
	
	
	  @Override
	  public String getDailyFortune() { // TODO Auto-generated method
	   return fortuneService.getFortune(); }
	 
}
