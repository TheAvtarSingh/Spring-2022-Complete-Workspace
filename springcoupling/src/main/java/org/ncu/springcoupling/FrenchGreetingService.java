package org.ncu.springcoupling;

public class FrenchGreetingService implements GreetingService {
FortuneService fortuneService;
/*
public FrenchGreetingService(FortuneService fService) {
	this.fortuneService = fService;
}
*/
	@Override
	public void greet(String name) {
		System.out.println("Bonjour : "+name);

	}

	public void setFortuneService(FortuneService fservice) {
		this.fortuneService = fservice;
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
