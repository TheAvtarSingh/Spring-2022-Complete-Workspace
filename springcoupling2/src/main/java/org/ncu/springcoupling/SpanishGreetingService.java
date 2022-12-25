package org.ncu.springcoupling;

public class SpanishGreetingService implements GreetingService{

	public void greet(String name) {
		System.out.println("Hola"+name);
		
	}

}
