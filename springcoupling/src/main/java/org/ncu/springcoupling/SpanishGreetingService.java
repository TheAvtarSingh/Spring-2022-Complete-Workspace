package org.ncu.springcoupling;

public class SpanishGreetingService implements GreetingService {
	FortuneService fortuneService;
	public SpanishGreetingService(FortuneService fservice) {
		this.fortuneService = fservice;
	}
	@Override
	public void greet(String name) {
		System.out.println("Hola : "+name);

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
