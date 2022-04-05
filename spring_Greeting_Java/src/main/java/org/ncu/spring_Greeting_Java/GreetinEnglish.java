package org.ncu.spring_Greeting_Java;

public class GreetinEnglish implements GreetingService{
FortuneServce fortuneServce;
	public GreetinEnglish(FortuneServce fortuneServceeng) {
	this.fortuneServce = fortuneServceeng;
}

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hello " +name;
	}

	@Override
	public String fortunegiver() {
		return  fortuneServce.Fortune();
		
	}

}
