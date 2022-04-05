package org.ncu.springcoupling;

public class EnglishGreetingService implements GreetingService {

	
	//Create a reference of Helper service interface
	FortuneService fortuneService;
	//Define Constructor
	public EnglishGreetingService(FortuneService fservice) {
		this.fortuneService = fservice;
	}
	@Override
	public void greet(String name) {
		System.out.println("Hello : "+name);

	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
