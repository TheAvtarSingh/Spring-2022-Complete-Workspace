package org.ncu.spring_Greeting_Java;

import org.springframework.beans.factory.annotation.Value;

public class GreetinSpanish implements GreetingService {
FortuneServce fortuneServce;
	public GreetinSpanish(FortuneServce fortuneServcespanish) {
	this.fortuneServce = fortuneServcespanish;
}
//Class Fields
	@Value("${day}")
	private String day;
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}
	@Value("${week}")
	private String week;
	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hola "+name;
	}

	@Override
	public String fortunegiver() {
		return fortuneServce.Fortune();

	}

}
