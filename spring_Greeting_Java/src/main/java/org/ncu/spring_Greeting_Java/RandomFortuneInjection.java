package org.ncu.spring_Greeting_Java;

public class RandomFortuneInjection implements GreetingService {
FortuneServce fservice;
	public RandomFortuneInjection(FortuneServce randomServce) {
	this.fservice = randomServce;
}

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hello : "+name;
	}

	@Override
	public String fortunegiver() {
		// TODO Auto-generated method stub
		return fservice.Fortune();
	}

}
