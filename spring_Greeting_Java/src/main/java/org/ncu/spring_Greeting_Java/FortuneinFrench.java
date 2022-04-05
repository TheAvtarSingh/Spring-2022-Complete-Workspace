package org.ncu.spring_Greeting_Java;

public class FortuneinFrench implements FortuneServce {
public FortuneinFrench() {
	// TODO Auto-generated constructor stub
	System.out.println("Fortune in French Been Created ");
}
	@Override
	public String Fortune() {
		// TODO Auto-generated method stub
		return "Aujourd'hui est ton jour de chance";
	}

}
