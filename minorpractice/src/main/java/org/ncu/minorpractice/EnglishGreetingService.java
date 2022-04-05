package org.ncu.minorpractice;

public class EnglishGreetingService implements GreetingService {

	FortuneService fortuneService;
	
	public EnglishGreetingService(FortuneService fservice) {
		// TODO Auto-generated constructor stub
		fortuneService = fservice;
	}
	
	@Override
	public String greet(String name) {
		return "Hello : " + name;
		// TODO Auto-generated method stub

	}
	@Override
	public String myFortune() {
		return fortuneService.getFortune();
		
	}

}
