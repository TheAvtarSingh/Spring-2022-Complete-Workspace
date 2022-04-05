package org.ncu.spring_Greeting_Java;

public class FortuneinSpanish implements FortuneServce {
public FortuneinSpanish() {
	// TODO Auto-generated constructor stub
	System.out.println("Fortune in Spanish Been Created");
}
	@Override
	public String Fortune() {
		// TODO Auto-generated method stub
		return "Hoy es tu dia de suerte";
	}

}
