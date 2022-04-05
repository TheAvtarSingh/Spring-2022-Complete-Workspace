package org.ncu.spring_Greeting_Java;

public class FortuneinEnglish implements FortuneServce {
public FortuneinEnglish() {
	System.out.println("Fortune in English Bean is Created");
}
	@Override
	public String Fortune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day";
	}

}
