package org.ncu.Calculator;

public class SubtractionService implements MathService {
public SubtractionService() {
	// TODO Auto-generated constructor stub
	System.out.println("Bean Created for Subtraction Service");
}
	@Override
	public void operate(int x,int y) {
		// TODO Auto-generated method stub
System.out.println("Subtracting");
System.out.println(x-y);
	}

}
