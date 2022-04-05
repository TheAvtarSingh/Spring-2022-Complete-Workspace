package org.ncu.spring_Greeting_Java;

public class GreetinFrench implements GreetingService {
FortuneServce fortuneServce;
	public GreetinFrench(FortuneServce fortuneServcefrench) {
	this.fortuneServce = fortuneServcefrench; 
}

	public void setFortuneServce(FortuneServce fortuneServce) {
		this.fortuneServce = fortuneServce;
	}

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Bonjour : "+name;
	}

	@Override
	public String fortunegiver() {
		return fortuneServce.Fortune();

	}

}
