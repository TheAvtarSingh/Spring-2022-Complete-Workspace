package org.ncu.minorpractice;

public class SpanishGreetingService implements GreetingService {

	FortuneService fortuneService;

	/*
	 * public SpanishGreetingService(FortuneService fservice) { // TODO
	 * Auto-generated constructor stub this.fortuneService = fservice; }
	 */
	
	public void setFortuneService(FortuneService fservice) {
		this.fortuneService = fservice;
	}

	@Override
	public String greet(String name) {
		return "Hola : " + name;

	}
@Override
	public String myFortune() {
		// TODO Auto-generated method stub
		return "Aujourd'hui est ton jour de chance";
	}
}
