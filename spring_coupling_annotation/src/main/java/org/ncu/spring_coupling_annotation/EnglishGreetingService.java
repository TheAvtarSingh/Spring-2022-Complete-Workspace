package org.ncu.spring_coupling_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class EnglishGreetingService implements GreetingService {

	@Autowired
	@Qualifier("happyFortuneServiceEnglish")
	FortuneService fortuneService;
	/*
	 * //Define Constructor public EnglishGreetingService(FortuneService fservice) {
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
